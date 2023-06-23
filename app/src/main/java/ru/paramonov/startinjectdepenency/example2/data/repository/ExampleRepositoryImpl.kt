package ru.paramonov.startinjectdepenency.example2.data.repository

import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleLocalDataSource
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleRemoteDataSource
import ru.paramonov.startinjectdepenency.example2.data.mapper.ExampleMapper
import ru.paramonov.startinjectdepenency.example2.di.MainLocalDataSourceQualifier
import ru.paramonov.startinjectdepenency.example2.di.MainRemoteDataSourceQualifier
import ru.paramonov.startinjectdepenency.example2.di.TestLocalDataSourceQualifier
import ru.paramonov.startinjectdepenency.example2.di.TestRemoteDataSourceQualifier
import ru.paramonov.startinjectdepenency.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val mapper: ExampleMapper,
    @TestLocalDataSourceQualifier private val localDataSource: ExampleLocalDataSource,
    @TestRemoteDataSourceQualifier private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
