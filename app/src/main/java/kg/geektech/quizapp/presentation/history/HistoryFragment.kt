package kg.geektech.quizapp.presentation.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kg.geektech.quizapp.R
import kg.geektech.quizapp.databinding.FragmentHistoryBinding
import kg.geektech.quizapp.domain.common.base.BaseFragment
import kg.geektech.quizapp.domain.main.entity.CategoryEntity
import kg.geektech.quizapp.domain.main.entity.HistoryEntity
import kg.geektech.quizapp.presentation.MainViewModel
import kg.geektech.quizapp.utils.extension.fill
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpAdapter()
    }

    private fun setUpAdapter() {
        val adapter = HistoryAdapter()
        binding.rvHistory.adapter = adapter
        val list: ArrayList<HistoryEntity> = ArrayList()
        fill(HistoryEntity(1, "All", "Any", "10/10", "now"), list)
        adapter.submitList(list)

    }

    override fun bind(): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun setUpListeners() {

    }

    override fun setUpObservers() {

    }

    override fun setUpUi() {

    }
}