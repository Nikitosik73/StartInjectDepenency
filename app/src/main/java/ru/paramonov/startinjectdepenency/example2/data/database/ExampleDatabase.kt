package ru.paramonov.startinjectdepenency.example2.data.database

import android.content.Context
import android.util.Log
import ru.paramonov.startinjectdepenency.R
import ru.paramonov.startinjectdepenency.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val currentTime: Long
){

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} $currentTime $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
