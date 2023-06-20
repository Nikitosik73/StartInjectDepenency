package ru.paramonov.startinjectdepenency.example1

class Activity {

    // первый способ доставки зависимотей через поля класса
//    val computer = Component().getComputer()
    // второй способ доставки зависмотей через поля класса
    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}