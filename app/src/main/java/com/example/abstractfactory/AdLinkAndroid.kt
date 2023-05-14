package com.example.abstractfactory

class AdLinkAndroid : AdLink {

    private val link: String

    constructor(link: String) {
        this.link = link

    }

    override fun getLink(): String {

        return this.link
    }
}