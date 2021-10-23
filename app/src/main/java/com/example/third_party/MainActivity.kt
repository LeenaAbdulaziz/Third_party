package com.example.third_party

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.skydoves.elasticviews.ElasticAnimation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun views(view: View) {
        when (view.id) {
            R.id.btn1 -> Toast.makeText(applicationContext, "Week 1 task", Toast.LENGTH_SHORT)
                .show()
            R.id.btn2 -> Toast.makeText(applicationContext, "Week 2 task", Toast.LENGTH_SHORT)
                .show()
            R.id.btn3 -> Toast.makeText(applicationContext, "Week 3 task", Toast.LENGTH_SHORT)
                .show()
            R.id.imv-> ElasticAnimation(view)
                .setScaleX(0.75f)
                .setScaleY(0.75f).
                setDuration(500).doAction()
            R.id.RL-> ElasticAnimation(view)
                .setScaleX(0.75f)
                .setScaleY(0.75f).
                setDuration(700).doAction()
        }
    }}