package ru.paramonov.startinjectdepenency.example2.di

import dagger.Binds
import dagger.Module
import ru.paramonov.startinjectdepenency.example2.data.repository.ExampleRepositoryImpl
import ru.paramonov.startinjectdepenency.example2.domain.ExampleRepository

@Module
interface DomainModule {

    @Binds
    fun bindRepository(
        impl: ExampleRepositoryImpl
    ): ExampleRepository
}