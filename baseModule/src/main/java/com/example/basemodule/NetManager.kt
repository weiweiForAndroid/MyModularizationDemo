package com.example.basemodule

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object NetManager {

    val okHttpClient: OkHttpClient
        get() {
            return OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .build()
        }
}