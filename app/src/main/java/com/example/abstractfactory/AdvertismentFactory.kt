package com.example.abstractfactory

interface AdvertismentFactory {


    enum class OS {

        Android, IOS
    }

    fun createAdvertismentForBorat(): BoratAd
    fun createAdvertismentForPhone(): PhoneAd

    companion object {


        fun createFactory(os: OS): AdvertismentFactory {

            return when (os) {

                OS.IOS -> IosAdvertismentFactory
                OS.Android -> AndroidAdvertismentFactory
            }
        }
    }

}