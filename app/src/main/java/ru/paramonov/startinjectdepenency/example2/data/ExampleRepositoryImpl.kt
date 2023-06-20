package ru.paramonov.startinjectdepenency.example2.data

import ru.paramonov.startinjectdepenency.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}
