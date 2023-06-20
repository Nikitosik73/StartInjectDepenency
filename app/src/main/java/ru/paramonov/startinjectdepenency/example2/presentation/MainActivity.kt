package ru.paramonov.startinjectdepenency.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.paramonov.startinjectdepenency.R
import ru.paramonov.startinjectdepenency.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.computer.toString()
    }
}