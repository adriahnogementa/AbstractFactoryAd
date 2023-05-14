package com.example.abstractfactory

class AdLinkIOS : AdLink {

    private val link: String

    constructor(link: String) {
        this.link = link

    }

    override fun getLink(): String {

        return link
    }
}