package com.example.calculator

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var operator = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editFirst = findViewById<EditText>(R.id.Text_operation)
        val editSecond = findViewById<EditText>(R.id.EditText2)
        var textResult = findViewById<TextView>(R.id.text_result)
        val btn_plus = findViewById<Button>(R.id.btn_plus)
        val btn_minus = findViewById<Button>(R.id.btn_minus)
        val btn_multiplication = findViewById<Button>(R.id.btn_multiplication)
        val btn_division = findViewById<Button>(R.id.btn_division)
        val btn_result = findViewById<Button>(R.id.btn_result)


        btn_plus.setOnClickListener {
            operator = "+"
        }

        btn_minus.setOnClickListener {
            operator = "-"
        }
        btn_multiplication.setOnClickListener {
            operator = "*"
            btn_division.setOnClickListener {
                operator = "/"
            }
            btn_result.setOnClickListener{
                val input1=editSecond.text.toString().toDouble()
                val input2 = editFirst.text.toString().toDouble()
                var result=0.0
                when (operator) {
                    "+" -> input1 + input2
                    "-" -> input1 - input2
                    "*" -> input1 * input2
                    "/" -> input1 / input2
                    else -> "invalid operator or number"
                }
                textResult.text=result.toString()
            }



            }
            }
        }




