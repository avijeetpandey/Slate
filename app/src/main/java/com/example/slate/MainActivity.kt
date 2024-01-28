package com.example.slate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slate.views.DrawingView

class MainActivity : AppCompatActivity() {
    private val drawingView: DrawingView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}