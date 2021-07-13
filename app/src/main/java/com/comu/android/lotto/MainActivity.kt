package com.comu.android.lotto

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<Button>(R.id.lottoNum1)
        val num2 = findViewById<Button>(R.id.lottoNum2)
        val num3 = findViewById<Button>(R.id.lottoNum3)
        val num4 = findViewById<Button>(R.id.lottoNum4)
        val num5 = findViewById<Button>(R.id.lottoNum5)
        val num6 = findViewById<Button>(R.id.lottoNum6)
        findViewById<FloatingActionButton>(R.id.runButton).setOnClickListener {
            Log.d("로또앱", "버튼 누름")
            num1.text = "79"
            num1.backgroundTintList = ColorStateList.valueOf(Color.rgb(255,0,0))
            num2.text = "26"
            num2.backgroundTintList = ColorStateList.valueOf(Color.rgb(252,186,3))
            num3.text = "16"
            num3.backgroundTintList = ColorStateList.valueOf(Color.rgb(3,252,44))
            num4.text = "7"
            num4.backgroundTintList = ColorStateList.valueOf(Color.rgb(3,169,252))
            num5.text = "63"
            num5.backgroundTintList = ColorStateList.valueOf(Color.rgb(71,81,255))
            num6.text = "52"
            num6.backgroundTintList = ColorStateList.valueOf(Color.rgb(235,163,240))
        }
    }
}