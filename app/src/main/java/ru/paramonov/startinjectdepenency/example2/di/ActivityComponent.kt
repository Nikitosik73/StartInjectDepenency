package ru.paramonov.startinjectdepenency.example2.di

import dagger.BindsInstance
import dagger.Subcomponent
import ru.paramonov.startinjectdepenency.example2.presentation.MainActivity
import ru.paramonov.startinjectdepenency.example2.presentation.MainActivity2

@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface ActivityFactory {

        fun create(
            @BindsInstance id: String
        ): ActivityComponent
    }
}