package com.example.lovecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.example.mylovecalculator.OnBoardAdapter
import com.example.mylovecalculator.R
import com.example.mylovecalculator.databinding.FragmentOnBoardBinding
import com.example.mylovecalculator.board.OnBoardModel
import com.example.mylovecalculator.prefs.Prefs
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardingFragment : Fragment(){

    private lateinit var binding: FragmentOnBoardBinding
    private val list = arrayListOf<OnBoardModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.add(
            OnBoardModel(
                R.raw.task_one,
                " welcom to my app",
                " hi"
            )
        )
        list.add(
            OnBoardModel(
                R.raw.task_2,
                "any text 1",
                "go"
            )
        )
        list.add(
            OnBoardModel(
                R.raw.task_3,
                "any text 2",
                "net",

            )

        )
        list.add(
            OnBoardModel(
                R.raw.task_2,
                " any text 3",
                "" +
                        "look"
            )
        )
        binding.vpOnBoarding.adapter = OnBoardAdapter(list)
        binding.dotsIndicator.attachTo(binding.vpOnBoarding)
    }




}

