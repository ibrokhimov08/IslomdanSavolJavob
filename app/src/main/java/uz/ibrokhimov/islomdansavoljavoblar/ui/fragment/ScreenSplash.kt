package uz.ibrokhimov.islomdansavoljavoblar.ui.fragment

import android.os.Handler
import android.view.View
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.islomdansavoljavoblar.core.base.BaseFragment
import uz.ibrokhimov.islomdansavoljavoblar.databinding.ScreenSplashBinding


class ScreenSplash : BaseFragment() {

    private val binding by lazy { ScreenSplashBinding.inflate(layoutInflater) }

    override fun onCreate(): View {
        return binding.root
    }

    override fun onCreated() {

        Handler().postDelayed(
            {
                findNavController().navigate(ScreenSplashDirections.splashToStart())
            },
            1500
        )
    }
}