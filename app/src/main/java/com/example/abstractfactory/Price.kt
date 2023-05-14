package com.example.abstractfactory

open class Price {
    private val price: Int

    constructor(price: Int) {

        this.price = price * 2
    }

    fun getPrice(): Int {

        return price
    }

}