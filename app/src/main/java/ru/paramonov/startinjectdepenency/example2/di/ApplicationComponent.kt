package ru.paramonov.startinjectdepenency.example2.di

import dagger.Component
import ru.paramonov.startinjectdepenency.example2.presentation.MainActivity

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}
