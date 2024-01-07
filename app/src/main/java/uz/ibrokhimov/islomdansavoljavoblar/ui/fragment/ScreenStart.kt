package uz.ibrokhimov.islomdansavoljavoblar.ui.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.islomdansavoljavoblar.core.base.BaseFragment
import uz.ibrokhimov.islomdansavoljavoblar.databinding.ScreenStartBinding
import uz.ibrokhimov.quizislamic.core.base.BaseFragment
import uz.ibrokhimov.quizislamic.databinding.ScreenStartBinding

class ScreenStart : BaseFragment() {
    private val binding by lazy { ScreenStartBinding.inflate(layoutInflater) }

    override fun onCreate(): View {
        return binding.root
    }

    override fun onCreated() {
        loadAction()

    }

    private fun loadAction() {

        binding.startBtn.setOnClickListener{
            findNavController().navigate(ScreenStartDirections.screenToGame())
        }

        binding.exitBtn.setOnClickListener{
            findNavController().popBackStack()
        }

    }
}