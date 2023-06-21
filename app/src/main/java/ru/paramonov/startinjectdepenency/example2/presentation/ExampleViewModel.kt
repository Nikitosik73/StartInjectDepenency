package ru.paramonov.startinjectdepenency.example2.presentation

import ru.paramonov.startinjectdepenency.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
