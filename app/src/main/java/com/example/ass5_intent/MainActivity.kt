package com.example.ass5_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v: View){
        var selectID :Int = radioGroup.checkedRadioButtonId
        var radioButtonChecked= findViewById<RadioButton>(selectID)
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("stdData",Employee(edit_name.text.toString(),radioButtonChecked.text.toString(),edit_email.text.toString(),edit_salary.text.toString()))
        startActivity(intent)
    }

    fun reset(v: View){
        edit_name.text.clear()
        edit_salary.text.clear()
        edit_email.text.clear()
        radioGroup.clearCheck()
    }
}