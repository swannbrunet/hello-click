package com.example.swann.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var i: Int = 0
    private var inc: Int = 1

    override fun onClick(v: View?) {
        if (v !=  null) {
            when(v.id) {
                R.id.button3 -> {
                    Log.d("test", "coucou")
                    i += inc
                    textView3.text = i.toString()
                }
                R.id.button4 -> {
                    i = 0
                    inc = 1
                    textView3.text = i.toString()
                }
                R.id.button -> {
                    inc += 1
                }
                R.id.button5 -> {
                    inc = -inc
                }
                R.id.button2 -> {
                    inc = 1git
                }

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this@MainActivity)
        button2.setOnClickListener(this@MainActivity)
        button3.setOnClickListener(this@MainActivity)
        button4.setOnClickListener(this@MainActivity)
        button5.setOnClickListener(this@MainActivity)
    }
}
