package com.example.modulea.net

data class BaseResponse<T>(
    val code: Int,
    val message: String,
    val result: T
)