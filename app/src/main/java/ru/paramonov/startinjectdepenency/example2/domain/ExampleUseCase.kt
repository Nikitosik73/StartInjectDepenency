package ru.paramonov.startinjectdepenency.example2.domain

import ru.paramonov.startinjectdepenency.example2.domain.ExampleRepository

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {

    }
}
