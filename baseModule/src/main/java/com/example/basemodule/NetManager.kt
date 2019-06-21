package com.example.basemodule

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

object NetManager {

    val okHttpClient: OkHttpClient
        get() {
            return OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .addInterceptor(HttpLoggingInterceptor(MyLogger()))
                .writeTimeout(1, TimeUnit.MINUTES)
                .build()
        }


    class MyLogger : HttpLoggingInterceptor.Logger {
        override fun log(message: String) {
            Log.e("wellsen", message)
        }

    }
}