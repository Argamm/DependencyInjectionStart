package com.example.dependencyinjectionstart.example1

class Component1 {
    private fun getComputer():Computer {
        val monitor = com.example.dependencyinjectionstart.example1.Monitor()
        val keyboard = com.example.dependencyinjectionstart.example1.Keyboard()
        val mouse = com.example.dependencyinjectionstart.example1.Mouse()
        val computerTower = com.example.dependencyinjectionstart.example1.ComputerTower(
            com.example.dependencyinjectionstart.example1.Storage(),
            com.example.dependencyinjectionstart.example1.Memory(),
            com.example.dependencyinjectionstart.example1.Processor()
        )
        return com.example.dependencyinjectionstart.example1.Computer(
            monitor,
            computerTower,
            keyboard,
            mouse
        )
    }

    fun inject(activity: Activity) {
        activity.keyboard = com.example.dependencyinjectionstart.example1.Keyboard()
    }

}