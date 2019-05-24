package com.example.basemodule

import android.util.Log

fun log(msg: String?) = Log.e("wellsen", Thread.currentThread().name + "/" + msg)
