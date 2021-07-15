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
    private val numbers = arrayListOf<Int>() // 숫자들을 저장할 배열

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
            numbers.clear() // 버튼을 누를 때마다 배열을 초기화

            setLottoNum(num1)
            setLottoNum(num2)
            setLottoNum(num3)
            setLottoNum(num4)
            setLottoNum(num5)
            setLottoNum(num6)
        }
    }

    private fun setLottoNum(lottoNum: Button) {
        var number = 0 // 임의로 number를 설정
        while (true) {
            number = random.nextInt(45) + 1
            if ( !numbers.contains(number) ) {
                numbers.add(number) // 중복되지 않는다면 배열에 추가
                break // 중복된다면 다시 반복문 처음으로
            }
        }

        lottoNum.text = "${number}"

        if ( number <= 10 ) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(252,186,3))
        } else if ( number <= 20  ) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(3,169,252))
        } else if ( number <= 30  ) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(255,0,0))
        } else if ( number <= 40  ) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(235,163,240))
        } else {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(3,252,44))
        }
    }
}

