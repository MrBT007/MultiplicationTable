package com.example.multiplicationtable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var textView: TextView
    lateinit var m1:TextView
    lateinit var m2:TextView
    lateinit var m3:TextView
    lateinit var m4:TextView
    lateinit var m5:TextView
    lateinit var m6:TextView
    lateinit var m7:TextView
    lateinit var m8:TextView
    lateinit var m9:TextView
    lateinit var m10:TextView
    lateinit var clear:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView2)
        button = findViewById(R.id.button)
        clear = findViewById(R.id.clear)
        m1 = findViewById(R.id.m1)
        m2 = findViewById(R.id.m2)
        m3 = findViewById(R.id.m3)
        m4 = findViewById(R.id.m4)
        m5 = findViewById(R.id.m5)
        m6 = findViewById(R.id.m6)
        m7 = findViewById(R.id.m7)
        m8 = findViewById(R.id.m8)
        m9 = findViewById(R.id.m9)
        m10 = findViewById(R.id.m10)

        button.setOnClickListener(object: View.OnClickListener
        {
            override fun onClick(p0: View?) {
                var inputasString = editText.text.toString()
                var n = inputasString.toInt()
                textView.setText("Your Multiplication Table is Ready!")

                m1.setText("$n X 1 = "+n*1)
                m2.setText("$n X 2 = "+n*2)
                m3.setText("$n X 3 = "+n*3)
                m4.setText("$n X 4 = "+n*4)
                m5.setText("$n X 5 = "+n*5)
                m6.setText("$n X 6 = "+n*6)
                m7.setText("$n X 7 = "+n*7)
                m8.setText("$n X 8 = "+n*8)
                m9.setText("$n X 9 = "+n*9)
                m10.setText("$n X 10 = "+n*10)
            }
        })
        clear.setOnClickListener(object: View.OnClickListener
        {
            override fun onClick(p0: View?) {
                editText.setText("")
                textView.setText("")
                m1.setText("")
                m2.setText("")
                m3.setText("")
                m4.setText("")
                m5.setText("")
                m6.setText("")
                m7.setText("")
                m8.setText("")
                m9.setText("")
                m10.setText("")
            }
        })
    }
}

