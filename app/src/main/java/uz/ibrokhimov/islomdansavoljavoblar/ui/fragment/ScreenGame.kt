package uz.ibrokhimov.islomdansavoljavoblar.ui.fragment

import android.os.Handler
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.forEachIndexed
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.islomdansavoljavoblar.R
import uz.ibrokhimov.islomdansavoljavoblar.core.base.BaseFragment
import uz.ibrokhimov.islomdansavoljavoblar.core.data.Data
import uz.ibrokhimov.islomdansavoljavoblar.databinding.ScreenGameBinding


class ScreenGame : BaseFragment() {
    private val binding by lazy { ScreenGameBinding.inflate(layoutInflater) }
    private var position = 0
    private val data = Data.getAllData()
    private var coin = 0
    private var questionSize = 15
    private var isChecked = true

    override fun onCreate(): View {
        return binding.root
    }

    override fun onCreated() {


        loadView()
        loadAction()


    }

    private fun loadAction() {

        binding.answerGroup.forEachIndexed { i, _ ->

            val textView = binding.answerGroup.getChildAt(i) as TextView

            textView.setOnClickListener {
                val userAnswer = data[position].javoblar[i]

                if (isChecked) {
                    if (userAnswer == data[position].javob) {
                        isChecked = false
                        textView.setBackgroundResource(R.drawable.shape_of_start_btn)
                        if (!isChecked) {

                            // wait for check
                            Handler().postDelayed(
                                {
                                    positionIncreament()
                                    coin += 5
                                    loadView()
                                }, 3_000
                            )

                            Handler().postDelayed({
                                textView.setBackgroundResource(R.drawable.shape_of_true)
                            }, 1_500)


                        }

                    } else {
                        isChecked = false
                        textView.setBackgroundResource(R.drawable.shape_of_start_btn)


                        // wait for check
                        Handler().postDelayed({
                            if (!isChecked) {
                                positionIncreament()
                                loadView()
                            }
                        }, 3_000)

                        // false answer color
                        Handler().postDelayed({
                            if (!isChecked) {
                                textView.setBackgroundResource(R.drawable.shape_of_false)
                            }
                        }, 1_500)

                    }
                }
            }
        }
        binding.changeQuestion.setOnClickListener {

            if (coin >= 10) {
                coin -= 10
                binding.winCoin.text = "Yutuq: $coin"
                questionSize++
                positionIncreament()
                loadView()
            } else {
                Toast.makeText(
                    requireContext(),
                    "Sizning yutuqlar soningiz kamida 10 bolishi kerak",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

        binding.halfBtn.setOnClickListener {



        }

    }


    private fun positionIncreament() {
        if (position < questionSize)
            position++
        else
            findNavController().navigate(ScreenGameDirections.gameToResult())
    }

    private fun loadView() {
        isChecked = true


        binding.question.text = data[position].savol
        binding.answerGroup.forEachIndexed { i, _ ->
            binding.answerGroup.getChildAt(i).setBackgroundResource(R.drawable.shape_of_bar)
            val child = binding.answerGroup.getChildAt(i) as TextView
            child.text = data[position].javoblar[i]
        }
        binding.winCoin.text = "Yutuq:$coin"
        binding.questionCount.text = "Savol: ${position + 1}/15"

    }


}