package com.example.modulea.net

import android.util.Log
import com.example.basemodule.NetManager
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    val poetry: Poetry by lazy {
        Log.e("wellsen", "延迟初始化网络请求接口")
        Retrofit.Builder().client(NetManager.okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.apiopen.top")
            .build().create(Poetry::class.java)
    }

}