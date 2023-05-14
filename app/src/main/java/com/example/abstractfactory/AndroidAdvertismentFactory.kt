package com.example.abstractfactory

object AndroidAdvertismentFactory : AdvertismentFactory {

    override fun createAdvertismentForBorat(): BoratAd {
        return BoratAd(
            AdLinkIOS("www.boratForCoolKids.com"),
            AdTextIOS("Borat Anzug"),
            AdPictureIOS(R.drawable.borat_android),
            Price(100)
        )
    }

    override fun createAdvertismentForPhone(): PhoneAd {
        return PhoneAd(
            AdLinkIOS("www.phone4Evryöne.com"),
            AdTextIOS("Nokia, Fortschritt durch Technik"),
            AdPictureIOS(R.drawable.phone_android),
            Price(400)
        )
    }
}