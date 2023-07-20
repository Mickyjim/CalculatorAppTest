package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.btnDivide
import kotlinx.android.synthetic.main.activity_main.btnMinus
import kotlinx.android.synthetic.main.activity_main.btnMultiplication
import kotlinx.android.synthetic.main.activity_main.btnPlus
import kotlinx.android.synthetic.main.activity_main.etInput1
import kotlinx.android.synthetic.main.activity_main.etInput2
import kotlinx.android.synthetic.main.activity_main.tvResult

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener {
            val input1 = etInput1.text.toString().toInt()
            val input2 = etInput2.text.toString().toInt()

            tvResult.text = (input1+input2).toString()
        }

        btnMinus.setOnClickListener {
            val input1 = etInput1.text.toString().toInt()
            val input2 = etInput2.text.toString().toInt()

            tvResult.text = (input1-input2).toString()
        }

        btnDivide.setOnClickListener {
            val input1 = etInput1.text.toString().toInt()
            val input2 = etInput2.text.toString().toInt()

            tvResult.text = (input1/input2).toString()
        }

        btnMultiplication.setOnClickListener {
            val input1 = etInput1.text.toString().toInt()
            val input2 = etInput2.text.toString().toInt()

            tvResult.text = (input1*input2).toString()
        }
    }
}