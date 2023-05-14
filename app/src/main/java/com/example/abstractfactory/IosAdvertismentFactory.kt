package com.example.abstractfactory

object IosAdvertismentFactory : AdvertismentFactory {

    override fun createAdvertismentForBorat(): BoratAd {
        return BoratAd(
            AdLinkIOS("www.boratForRichKids.com"),
            AdTextIOS("Borat Anzug für die Auserwählten"),
            AdPictureIOS(R.drawable.bora_ios),
            PriceIos(100)
        )
    }

    override fun createAdvertismentForPhone(): PhoneAd {
        return PhoneAd(
            AdLinkIOS("www.phoneForRichKids.com"),
            AdTextIOS("Iphone 14 Pro"),
            AdPictureIOS(R.drawable.phone_ios),
            PriceIos(1000)
        )
    }

}