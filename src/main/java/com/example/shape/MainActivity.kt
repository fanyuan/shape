package com.example.shape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shape.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        dataBinding.act = this
    }
    fun shape01(){
        startActivity(Intent(this,Shape01Activity::class.java))
    }
    fun shape02(){
        startActivity(Intent(this,Shape02Activity::class.java))
    }
    fun shape03(){
        startActivity(Intent(this,Shape03Activity::class.java))
    }
    fun shape3(){
        startActivity(Intent(this,Shape3Activity::class.java))
    }
}