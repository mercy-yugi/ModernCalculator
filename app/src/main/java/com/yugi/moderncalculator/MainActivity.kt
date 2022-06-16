package com.yugi.moderncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstNum: TextInputLayout
    lateinit var etFirstNum: EditText
    lateinit var tilSecondNum: TextInputLayout
    lateinit var etSecondNum: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilFirstNum = findViewById(R.id.tilFirstNum)
        tilSecondNum = findViewById(R.id.tilSecondNUm)
        etFirstNum = findViewById(R.id.etFirstNum)
        etSecondNum = findViewById(R.id.etSecondNum)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision = findViewById(R.id.btnDivision)
        tvOutput = findViewById(R.id.tvOutput)

        btnAdd.setOnClickListener {
            tvOutput.text=""
            val firstNum = etFirstNum.text.toString()
            val secondNum = etSecondNum.text.toString()
            if (firstNum.isBlank()) {
                etFirstNum.setError("Number is required!")
                return@setOnClickListener
            }
            if (secondNum.isBlank()) {
                etSecondNum.setError("Number is required!")
                return@setOnClickListener
            }
            addNum(firstNum.toInt(),secondNum.toInt())
        }
        btnSubtract.setOnClickListener {
            tvOutput.text=""
            val firstNum = etFirstNum.text.toString()
            val secondNum = etSecondNum.text.toString()
            if (firstNum.isBlank()) {
                etFirstNum.setError("Number is required!")
                return@setOnClickListener
            }
            if (secondNum.isBlank()) {
                etSecondNum.setError("Number is required!")
                return@setOnClickListener
            }
            subtractNum(firstNum.toInt(),secondNum.toInt())
        }
        btnModulus.setOnClickListener {
            tvOutput.text=""
            val firstNum = etFirstNum.text.toString()
            val secondNum = etSecondNum.text.toString()
            if (firstNum.isBlank()) {
                etFirstNum.setError("Number is required!")
                return@setOnClickListener
            }
            if (secondNum.isBlank()) {
                etSecondNum.setError("Number is required!")
                return@setOnClickListener
            }
            modulusNum(firstNum.toInt(),secondNum.toInt())
        }
        btnDivision.setOnClickListener {
            tvOutput.text=""
            val firstNum = etFirstNum.text.toString()
            val secondNum = etSecondNum.text.toString()
            if (firstNum.isBlank()) {
                etFirstNum.setError("Number is required!")
                return@setOnClickListener
            }
            if (secondNum.isBlank()) {
                etSecondNum.setError("Number is required!")
                return@setOnClickListener
            }
            divisionNum(firstNum.toInt(),secondNum.toInt())
        }

    }
    fun addNum(first_num:Int,second_num:Int){
        val add=first_num+second_num
        tvOutput.text=add.toString()
    }
    fun subtractNum(first_num:Int,second_num:Int){
        val add=first_num-second_num
        tvOutput.text=add.toString()
    }
    fun modulusNum(first_num:Int,second_num:Int){
        val add=first_num%second_num
        tvOutput.text=add.toString()
    }
    fun divisionNum(first_num:Int,second_num:Int){
        val add=first_num/second_num
        tvOutput.text=add.toString()
    }
}

