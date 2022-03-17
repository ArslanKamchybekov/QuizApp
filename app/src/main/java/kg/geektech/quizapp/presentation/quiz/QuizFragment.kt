package kg.geektech.quizapp.presentation.quiz

import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kg.geektech.quizapp.databinding.FragmentQuizBinding
import kg.geektech.quizapp.domain.common.base.BaseFragment
import kg.geektech.quizapp.domain.main.entity.CategoryEntity
import kg.geektech.quizapp.presentation.MainViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class QuizFragment : BaseFragment<FragmentQuizBinding>() {

    private val viewModel: MainViewModel by viewModels()

    override fun bind(): FragmentQuizBinding {
        return FragmentQuizBinding.inflate(layoutInflater)
    }

    override fun setUpListeners() {
        binding.sbAmount.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.tvAmount.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}

        })
    }

    override fun setUpObservers() {
        viewModel.categoryList.flowWithLifecycle(lifecycle, Lifecycle.State.STARTED
        ).onEach {
            handleCategory(it)
        }.launchIn(lifecycleScope)
    }

    private fun handleCategory(list: List<CategoryEntity>) {
        val adapter: ArrayAdapter<CategoryEntity> =
            ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, list)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerCategory.adapter = adapter
    }

    override fun setUpUi() {

    }

}