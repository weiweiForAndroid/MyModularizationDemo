package com.example.modulea

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.basemodule.log
import com.example.modulea.net.Api
import kotlinx.android.synthetic.main.module_a_activity_main.*
import kotlinx.coroutines.*


/**
 * @author wellsen
 * moduleA 的MainActivity
 */
class ModuleAMainActivity : AppCompatActivity(), CoroutineScope by MainScope() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_a_activity_main)
        log("moduleA的MainActivity  onCreate()")
        progress_bar.visibility = View.VISIBLE
        launch(Dispatchers.Main) {
            tv.text = getPoetry()
            progress_bar.visibility = View.GONE
        }
    }

    private suspend fun getPoetry(): String? {
        val response = Api.poetry.getPoetry()
//        if ()
        return "假装接口返回数据了"
    }


    override fun onDestroy() {
        super.onDestroy()
        cancel()
    }

}
