package com.Idaya.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity:AppCompatActivity() {

    lateinit var number1: TextView
    lateinit var number2: TextView
    lateinit var btn_answer: TextView
    lateinit var btn_add: Button
    lateinit var btn_sub: Button
    lateinit var btn_mul: Button
    lateinit var btn_div: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        addNumbers()
        subNumbers()
        multiplyNumbers()
        divideNumbers()

    }

    fun addNumbers() {
        var first = findViewById<TextView>(R.id.number1)
        var second = findViewById<TextView>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_add)
        button.setOnClickListener {
            var sumfirst = first.text.toString().toInt()
            var sumsecond = second.text.toString().toInt()
            var output = sumfirst + sumsecond
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun subNumbers() {
        var first = findViewById<TextView>(R.id.number1)
        var second = findViewById<TextView>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_sub)
        button.setOnClickListener {
            var sub = first.text.toString().toInt()
            var sub2 = second.text.toString().toInt()
            var output = sub - sub2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun multiplyNumbers() {
        var first = findViewById<TextView>(R.id.number1)
        var second = findViewById<TextView>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_mul)
        button.setOnClickListener {
            var multi = first.text.toString().toInt()
            var multi2 = second.text.toString().toInt()
            var output = multi * multi2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun divideNumbers() {
        var first = findViewById<TextView>(R.id.number1)
        var second = findViewById<TextView>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_div)
        button.setOnClickListener {
            var divide = first.text.toString().toInt()
            var divide2 = second.text.toString().toInt()
            var output = divide % divide2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
}
