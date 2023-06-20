package ru.paramonov.startinjectdepenency.example1

import com.example.dependencyinjectionstart.example1.Memory

class ComputerTower(
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
)
