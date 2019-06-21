package com.example.modulea.net

import retrofit2.Call
import retrofit2.http.POST

/**
 * 诗集
 */
interface Poetry {
    /**
     * 随机获取一首唐诗
     */
    @POST("/recommendPoetry")
    fun getPoetry(): Call<BaseResponse<PoetryBean>>
}

