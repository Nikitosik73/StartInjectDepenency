package ru.paramonov.startinjectdepenency.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.paramonov.startinjectdepenency.example2.presentation.MainActivity
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance currentTime: Long
        ): ApplicationComponent
    }
}
