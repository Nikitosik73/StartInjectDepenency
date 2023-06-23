package ru.paramonov.startinjectdepenency.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.paramonov.startinjectdepenency.example2.presentation.MainActivity
import ru.paramonov.startinjectdepenency.example2.presentation.MainActivity2
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.ActivityFactory

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance currentTime: Long
        ): ApplicationComponent
    }
}
