package com.example.abstractfactory

open class Ad {
    val adPicture: AdPicture
    val adText: AdText
    val adLink: AdLink
    val price: Price

    constructor(adLink: AdLink, adText: AdText, adPicture: AdPicture, price: Price) {

        this.adLink = adLink
        this.adText = adText
        this.adPicture = adPicture
        this.price = price;
    }


}