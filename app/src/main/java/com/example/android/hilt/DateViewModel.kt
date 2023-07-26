package com.example.android.hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit.Call
import javax.inject.Inject

@HiltViewModel
class DateViewModel @Inject constructor(
    private val timeService: TimeService
) : ViewModel() {

    fun getDataModel(): Call<DataModel> = timeService.getDataModel()
}
