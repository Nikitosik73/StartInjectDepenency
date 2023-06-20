package ru.paramonov.startinjectdepenency.example2.data.repository

import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleLocalDataSource
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleRemoteDataSource
import ru.paramonov.startinjectdepenency.example2.data.mapper.ExampleMapper
import ru.paramonov.startinjectdepenency.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val mapper: ExampleMapper,
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
