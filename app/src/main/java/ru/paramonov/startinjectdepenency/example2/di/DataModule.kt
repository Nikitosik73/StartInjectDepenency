package ru.paramonov.startinjectdepenency.example2.di

import dagger.Binds
import dagger.Module
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleLocalDataSource
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleRemoteDataSource
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleRemoteDataSourceImpl
import ru.paramonov.startinjectdepenency.example2.data.datasource.TestExampleLocalDataSourceImpl
import ru.paramonov.startinjectdepenency.example2.data.datasource.TestExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    @MainLocalDataSourceQualifier
    fun bindLocalDataSource(
        imp: ExampleLocalDataSourceImpl
    ): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    @MainRemoteDataSourceQualifier
    fun bindRemoteDataSource(
        impl: ExampleRemoteDataSourceImpl
    ): ExampleRemoteDataSource

    @ApplicationScope
    @Binds
    @TestLocalDataSourceQualifier
    fun bindTestLocalDataSource(
        impl: TestExampleLocalDataSourceImpl
    ): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    @TestRemoteDataSourceQualifier
    fun bindTestRemoteDataSource(
        impl: TestExampleRemoteDataSourceImpl
    ): ExampleRemoteDataSource
}
