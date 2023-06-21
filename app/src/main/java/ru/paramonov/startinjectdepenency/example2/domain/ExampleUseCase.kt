package ru.paramonov.startinjectdepenency.example2.domain

import ru.paramonov.startinjectdepenency.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}
