package ru.paramonov.startinjectdepenency.example2.data.datasource

import ru.paramonov.startinjectdepenency.example2.data.database.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
