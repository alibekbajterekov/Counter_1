package com.example.counter

interface View {
    fun changeCount(count:Int)
    fun changeColorToGreen()
    fun showToast()
}