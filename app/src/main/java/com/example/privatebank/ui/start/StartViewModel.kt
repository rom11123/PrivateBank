package com.example.privatebank.ui.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.privatebank.model.BezNalDto
import com.example.privatebank.retrofit.api.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {
    val repo = Repository()
    val liveData:MutableLiveData<Response<BezNalDto>> = MutableLiveData()

    fun getMoney(){
        viewModelScope.launch { Dispatchers.IO
            liveData.value = repo.getBezNal()
        }
    }
}