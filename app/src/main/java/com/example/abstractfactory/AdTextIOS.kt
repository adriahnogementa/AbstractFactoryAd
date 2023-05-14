package com.example.abstractfactory

class AdTextIOS : AdText {


    private val text: String

    constructor(text: String) {

        this.text = text
    }


    override fun getText(): String {
        return text
    }
}