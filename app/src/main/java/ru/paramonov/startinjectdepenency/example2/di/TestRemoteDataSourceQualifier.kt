package ru.paramonov.startinjectdepenency.example2.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class TestRemoteDataSourceQualifier
