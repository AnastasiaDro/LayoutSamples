package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.widget.SwitchCompat
import androidx.constraintlayout.widget.Group

class MainActivityGeneral : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val btn = findViewById<Button>(R.id.btn)
        val viewGroup = findViewById<Group>(R.id.group)
        val switchCenter = findViewById<SwitchCompat>(R.id.switch_center)
        btn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                //replace(R.id.main, GuideLineFragment.create())
                replace(R.id.main, PlaceholderFragment())
                commitAllowingStateLoss()
            }
        }
        switchCenter.setOnCheckedChangeListener { _, isChecked ->
            when (switchCenter.isChecked) {
                true -> viewGroup.visibility = View.VISIBLE
                false -> viewGroup.visibility = View.INVISIBLE
            }
        }
    }
}
