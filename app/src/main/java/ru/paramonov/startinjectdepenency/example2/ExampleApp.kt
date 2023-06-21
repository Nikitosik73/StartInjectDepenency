package ru.paramonov.startinjectdepenency.example2

import android.app.Application
import ru.paramonov.startinjectdepenency.example2.di.DaggerApplicationComponent


class ExampleApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}