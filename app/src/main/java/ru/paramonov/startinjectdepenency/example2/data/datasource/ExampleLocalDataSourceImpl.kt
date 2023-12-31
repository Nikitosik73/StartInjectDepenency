package ru.paramonov.startinjectdepenency.example2.data.datasource

import android.util.Log
import ru.paramonov.startinjectdepenency.example2.data.database.ExampleDatabase
import ru.paramonov.startinjectdepenency.example2.di.MainLocalDataSourceQualifier
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        Log.d("TEST_IMPL", "ExampleLocalDataSourceImpl: $this")
        database.method()
    }
}
