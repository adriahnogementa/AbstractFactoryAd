package com.example.abstractfactory

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showAdvertismentPhoneBtn = findViewById<Button>(R.id.ad_btn)
        val showAdvertismentAnzugBtn = findViewById<Button>(R.id.buttonanzug)



        showAdvertismentPhoneBtn.setOnClickListener(this::showPhoneAd)
        showAdvertismentAnzugBtn.setOnClickListener(this::showAnzugAd)


    }

    private fun showAnzugAd(view: View?) {
        val switchOs = findViewById<Switch>(R.id.switchOs)

        if (switchOs.isChecked) {


            val factory = AdvertismentFactory.createFactory(AdvertismentFactory.OS.IOS)

            val ad = factory.createAdvertismentForBorat()

            changeAd(ad)

        } else {
            val factory = AdvertismentFactory.createFactory(AdvertismentFactory.OS.Android)

            val ad = factory.createAdvertismentForBorat()

            changeAd(ad)

        }
    }

    /**
     * Change coffee recipe and name when button is clicked
     */
    fun showPhoneAd(view: View) {

        val switchOs = findViewById<Switch>(R.id.switchOs)

        if (switchOs.isChecked) {


            val factory = AdvertismentFactory.createFactory(AdvertismentFactory.OS.IOS)

            val ad = factory.createAdvertismentForPhone()

            changeAd(ad)

        } else {
            val factory = AdvertismentFactory.createFactory(AdvertismentFactory.OS.Android)

            val ad = factory.createAdvertismentForPhone()

            changeAd(ad)

        }


    }

    /**
     * Method that changes the coffee type
     */
    private fun changeAd(ad: Ad) {

        val link = findViewById<TextView>(R.id.link)

        val textAd = findViewById<TextView>(R.id.textAd)

        val priceAd = findViewById<TextView>(R.id.AdPrice)

        val pictureAd = findViewById<ImageView>(R.id.imageView)

        textAd.text = ad.adText.getText()

        link.text = ad.adLink.getLink()

        priceAd.text = ad.price.getPrice().toString() + " €"

        pictureAd.setImageResource(ad.adPicture.getPicture())
    }

}