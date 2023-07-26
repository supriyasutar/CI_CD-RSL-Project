package com.example.android.hilt

import retrofit.Call
import retrofit.http.GET

interface TimeService {

    @GET("current/zone?timeZone=Europe/Amsterdam")
    fun getDataModel(): Call<DataModel>
}