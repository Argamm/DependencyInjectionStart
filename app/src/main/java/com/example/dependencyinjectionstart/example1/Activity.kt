package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    init {//in activity need to do this in onCreate methode
//        DaggerNewComponent.create().inject(this)
    }

    fun getKeyboard() {

    }



}