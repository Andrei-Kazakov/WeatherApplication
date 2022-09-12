package com.example.weatherapplication2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapplication2.fragment.MainFragment



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()
    }
}