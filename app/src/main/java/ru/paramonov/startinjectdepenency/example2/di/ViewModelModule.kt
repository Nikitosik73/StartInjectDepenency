package ru.paramonov.startinjectdepenency.example2.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import ru.paramonov.startinjectdepenency.example2.presentation.ExampleViewModel
import ru.paramonov.startinjectdepenency.example2.presentation.ExampleViewModel2

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    @Binds
    fun bindExampleViewModel2(impl: ExampleViewModel2): ViewModel
}
