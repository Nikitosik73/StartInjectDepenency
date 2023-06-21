package ru.paramonov.startinjectdepenency.example2.data.network

import android.content.Context
import android.util.Log
import ru.paramonov.startinjectdepenency.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val currentTime: Long
){

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $currentTime $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
