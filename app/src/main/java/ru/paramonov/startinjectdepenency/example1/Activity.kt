package ru.paramonov.startinjectdepenency.example1

import javax.inject.Inject

class Activity {

    val component = DaggerNewComponent.create()

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var mouse: Mouse
    @Inject
    lateinit var monitor: Monitor

    init {
        component.inject(this)
    }
}