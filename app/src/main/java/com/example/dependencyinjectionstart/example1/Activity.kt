package com.example.dependencyinjectionstart.example1

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {//in activity need to do this in onCreate methode
        Component().inject(this)
    }

    fun getKeyboard() {
//        keyboard
    }



}