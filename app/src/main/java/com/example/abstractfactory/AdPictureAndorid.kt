package com.example.abstractfactory

class AdPictureAndorid : AdPicture {

    private val picture: Int

    constructor(picture: Int) {

        this.picture = picture
    }


    override fun getPicture(): Int {
        return picture
    }
}