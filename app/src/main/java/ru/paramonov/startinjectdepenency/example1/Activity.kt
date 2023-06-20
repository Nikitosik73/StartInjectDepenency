package ru.paramonov.startinjectdepenency.example1

import com.example.dependencyinjectionstart.example1.Memory

class Activity {

    val monitor = Monitor()
    val keyboard = Keyboard()
    val mouse = Mouse()
    val computerTower = ComputerTower(
        Storage(),
        Memory(),
        Processor()
    )
    val computer = Computer(monitor, computerTower, keyboard, mouse)
}