package com.example.android.hilt

import android.content.Context
import retrofit.Call
import retrofit.Callback
import retrofit.Response
import retrofit.Retrofit

class FakeTimeService(private val context: Context, val retrofit: Retrofit) : TimeService {

    override fun getDataModel(): Call<DataModel> {
        val dataModel = DataModel(
            date = context.getString(R.string.test_date),
            time = context.getString(R.string.test_time)
        )

        return object : Call<DataModel> {
            override fun clone(): Call<DataModel> {
                return this
            }

            override fun execute(): Response<DataModel> =
                Response.success(dataModel)

            override fun cancel() {
                TODO("Not yet implemented")
            }

            override fun enqueue(callback: Callback<DataModel>?) {
                callback?.onResponse(Response.success(dataModel), retrofit)
            }
        }
    }
}
