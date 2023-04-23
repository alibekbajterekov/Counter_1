package com.example.counter

class Model {
    var counter = 0

    fun increment() = counter++

    fun decrement() = counter--

    fun getCounterCondition() = counter
}