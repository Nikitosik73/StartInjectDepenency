package ru.paramonov.startinjectdepenency.example2.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleLocalDataSource
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleRemoteDataSource
import ru.paramonov.startinjectdepenency.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(
        imp: ExampleLocalDataSourceImpl
    ): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(
        impl: ExampleRemoteDataSourceImpl
    ): ExampleRemoteDataSource
}
