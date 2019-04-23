package com.example.basemodule

import android.content.res.Configuration

/**
 * 初始化工具类
 */
open class BaseLogicInit {
    open var mApplication: BaseApplication? = null
    fun setApplication(app: BaseApplication?) {
        mApplication = app
    }

    open fun onCreate() {}

    open fun onTerminate() {}
    open fun onLowMemory() {}
    open fun onTrimMemory() {}
    open fun onConfigChange(config: Configuration?) {}

}