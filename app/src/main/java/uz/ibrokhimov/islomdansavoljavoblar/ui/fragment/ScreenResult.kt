package uz.ibrokhimov.islomdansavoljavoblar.ui.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.islomdansavoljavoblar.core.base.BaseFragment
import uz.ibrokhimov.islomdansavoljavoblar.databinding.ScreenResultBinding

class ScreenResult : BaseFragment() {
    private val binding by lazy { ScreenResultBinding.inflate(layoutInflater) }

    override fun onCreate(): View {
        return binding.root
    }

    override fun onCreated() {

        loadAction()

    }

    private fun loadAction() {
        binding.refreshBtn.setOnClickListener {
            findNavController().popBackStack()
        }

    }


}