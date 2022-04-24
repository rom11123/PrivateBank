package com.example.privatebank.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.privatebank.R
import com.example.privatebank.ui.start.StartFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer,StartFragment())
            .commit()
    }
}