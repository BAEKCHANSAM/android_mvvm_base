package com.android.base.views.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.custom_base_project.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}