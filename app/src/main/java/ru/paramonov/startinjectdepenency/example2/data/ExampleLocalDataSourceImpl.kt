package ru.paramonov.startinjectdepenency.example2.data

import ru.paramonov.startinjectdepenency.example2.data.ExampleDatabase
import ru.paramonov.startinjectdepenency.example2.data.ExampleLocalDataSource

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {

    }
}
