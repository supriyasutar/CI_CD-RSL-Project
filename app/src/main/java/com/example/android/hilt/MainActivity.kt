package com.example.android.hilt

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import retrofit.Call
import retrofit.Callback
import retrofit.Response
import retrofit.Retrofit

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val viewModel: DateViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dateView: TextView = findViewById(R.id.date)
        val timeView: TextView = findViewById(R.id.time)

        // calling a method to create an update and passing our model class.
        val call: Call<DataModel> = viewModel.getDataModel()

        // in the below line, we are executing our method.
        call.enqueue(object : Callback<DataModel?> {
            override fun onResponse(response: Response<DataModel?>?, retrofit: Retrofit?) {
                val model: DataModel? = response?.body()

                Log.d("####", "onResponse: " + model?.date)
                dateView.text = model?.date
                timeView.text = model?.time
            }

            override fun onFailure(t: Throwable?) {
                Log.d("####", "onFailure: ")
            }
        })

    }
}
