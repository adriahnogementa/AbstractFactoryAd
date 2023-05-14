package com.example.abstractfactory

class AdPictureIOS : AdPicture {

    private val picture: Int

    constructor(picture: Int) {

        this.picture = picture
    }


    override fun getPicture(): Int {
        return picture
    }
}