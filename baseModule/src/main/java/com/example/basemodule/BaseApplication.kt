package com.example.basemodule

import android.app.Application
import android.content.res.Configuration
import java.lang.Exception
import java.lang.ref.WeakReference

/**
 * @author wellsen
 * 注册各个子模块的初始化工具类
 */
abstract class BaseApplication: Application() {
    private val logicList = ArrayList<BaseLogicInit>()
    private val logicClazzList = ArrayList<Class<out BaseLogicInit>>()

    abstract  fun initLogic()

    open fun registerApplicationLogic(clazz: Class<out BaseLogicInit> ){
        logicClazzList.add(clazz)
    }

    override fun onCreate() {
        super.onCreate()
        mContext = WeakReference(this)
        initLogic()
        for (clazz in logicClazzList){
            try {
                val instance = clazz.newInstance()
                logicList.add(instance)
                instance.onCreate()
            }catch (e:Exception){
                e.printStackTrace()
            }
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        for (instance in logicList){
            instance.onTerminate()
        }
    }

    override fun onLowMemory() {
        super.onLowMemory()
        for (instance in logicList){
            instance.onLowMemory()
        }
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        for (instance in logicList){
            instance.onTrimMemory()
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        for (instance in logicList){
            instance.onConfigChange(newConfig)
        }
    }

    companion object{
        lateinit var mContext :WeakReference<Application>
    }
}