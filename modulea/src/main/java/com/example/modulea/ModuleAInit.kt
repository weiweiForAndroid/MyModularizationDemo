package com.example.modulea

import android.content.res.Configuration
import android.util.Log
import com.example.basemodule.BaseLogicInit

/**
 * 可以放置一些模块各自需要在application中初始化的代码
 */
object ModuleAInit : BaseLogicInit() {
    override fun onCreate() {
        Log.i(this.javaClass.canonicalName, "onCreate")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.i(this.javaClass.canonicalName, "onLowMemory")
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.i(this.javaClass.canonicalName, "onTerminate")
    }

    override fun onTrimMemory() {
        super.onTrimMemory()
        Log.i(this.javaClass.canonicalName, "onTrimMemory")
    }

    override fun onConfigChange(config: Configuration?) {
        super.onConfigChange(config)
        Log.i(this.javaClass.canonicalName, "onConfigChange")
    }
}