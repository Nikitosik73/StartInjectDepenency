package ru.paramonov.startinjectdepenency.example1

class Component {

    private fun getComputer(): Computer {
        val monitor = Monitor()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
        val keyboard = Keyboard()
        val mouse = Mouse()

        return Computer(monitor, computerTower, keyboard, mouse)
    }

    fun inject(activity: Activity) {
//        activity.keyboard = Keyboard()
    }
}