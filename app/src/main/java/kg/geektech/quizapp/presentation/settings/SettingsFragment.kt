package kg.geektech.quizapp.presentation.settings

import android.os.Bundle
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import kg.geektech.quizapp.databinding.FragmentSettingsBinding
import kg.geektech.quizapp.domain.common.base.BaseFragment

@AndroidEntryPoint
class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun bind(): FragmentSettingsBinding {
        return FragmentSettingsBinding.inflate(layoutInflater)
    }

    override fun setUpListeners() {
        binding.btnClearHistory.setOnClickListener {

        }
        binding.btnLanguage.setOnClickListener {

        }
        binding.btnTheme.setOnClickListener {

        }
    }

    override fun setUpObservers() {

    }

    override fun setUpUi() {
    }
}