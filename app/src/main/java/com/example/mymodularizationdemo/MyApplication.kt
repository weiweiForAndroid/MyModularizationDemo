package com.example.mymodularizationdemo

import com.example.basemodule.BaseApplication
import com.example.modulea.ModuleAInit

/**
 * 主app
 * @author wellsen
 *
 */
class MyApplication:BaseApplication(){
    override fun initLogic() {
        registerApplicationLogic(ModuleAInit::class.java)
    }
}
