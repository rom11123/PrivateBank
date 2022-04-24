package com.example.privatebank.ui.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.privatebank.model.BezNalDto
import com.example.privatebank.retrofit.api.Repository
import retrofit2.Response

class StartViewModel:ViewModel() {
    val repo = Repository()
    val liveData:MutableLiveData<Response<BezNalDto>> = MutableLiveData()

    fun getMoney(){

        liveData.value = repo.getBezNal()

    }
}