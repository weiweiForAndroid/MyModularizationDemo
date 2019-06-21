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
        val response = async(Dispatchers.IO) {
            getPoetry()
        }
        launch {
            tv.text = response.await()
            progress_bar.visibility = View.GONE
        }
    }

    private fun getPoetry(): String? {
        val request = Api.poetry.getPoetry()
        request.execute().apply {
            if (isSuccessful) {
                return this.body()?.result?.content
            }
        }
        return "假装接口返回数据了"
    }


    override fun onDestroy() {
        super.onDestroy()
        cancel()
    }

}
