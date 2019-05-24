package com.example.moduleastandalone

import android.app.Application
import android.content.res.Configuration
import com.example.modulea.ModuleAInit

class ModuleAStandAloneApplication:Application(){

    override fun onCreate() {
        super.onCreate()
        ModuleAInit.onCreate()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        ModuleAInit.onLowMemory()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        ModuleAInit.onTrimMemory()
    }

    override fun onTerminate() {
        super.onTerminate()
        ModuleAInit.onTerminate()
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        ModuleAInit.onConfigChange(newConfig)
    }
}