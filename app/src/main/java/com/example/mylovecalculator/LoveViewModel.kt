package com.example.mylovecalculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mylovecalculator.remote.LoveModel
import com.example.mylovecalculator.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoveViewModel @Inject constructor(private val repository: Repository):ViewModel() {

    fun getLiveModel(fName:String,sName:String):LiveData<LoveModel>{
        return repository.getCalculate(fName,sName)
    }
}