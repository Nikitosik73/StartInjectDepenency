package ru.paramonov.startinjectdepenency.example2.data.datasource

import android.util.Log
import ru.paramonov.startinjectdepenency.example2.data.database.ExampleDatabase
import javax.inject.Inject

class TestExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        Log.d("TEST_IMPL", "TestExampleLocalDataSource: $this")
        database.method()
    }
}