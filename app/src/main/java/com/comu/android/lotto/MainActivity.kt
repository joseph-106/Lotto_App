package com.comu.android.lotto

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class MainActivity : AppCompatActivity() {
    private val random = Random() // 랜덤값을 사용할 수 있도록 선언

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
            setLottoNum(num1)
            setLottoNum(num2)
            setLottoNum(num3)
            setLottoNum(num4)
            setLottoNum(num5)
            setLottoNum(num6)
        }
    }

    private fun setLottoNum(lottoNum: Button) {
        val n = random.nextInt(45) + 1
        lottoNum.text = "${n}"

        if ( n <= 10 ) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(252,186,3))
        } else if ( n <= 20  ) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(3,169,252))
        } else if ( n <= 30  ) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(255,0,0))
        } else if ( n <= 40  ) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(235,163,240))
        } else {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(3,252,44))
        }
    }
}

