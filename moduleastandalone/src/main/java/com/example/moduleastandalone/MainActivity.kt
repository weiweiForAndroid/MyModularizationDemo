package com.example.moduleastandalone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.modulea.ModuleAMainActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_a_activity_main)
        startActivity(Intent(this, ModuleAMainActivity::class.java))
    }
}
