package com.example.moduleastandalone

import com.example.basemodule.BaseApplication
import com.example.modulea.ModuleAInit

class ModuleAStandAloneApplication : BaseApplication() {
    override fun initLogic() {
        registerApplicationLogic(ModuleAInit::class.java)
    }

}