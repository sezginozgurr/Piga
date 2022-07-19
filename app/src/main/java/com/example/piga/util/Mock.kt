package com.example.piga.util

import com.example.piga.R
import com.example.piga.data.fakemodel.HobbyModel
import com.example.piga.data.fakemodel.OnboardingPagerModel
import com.example.piga.data.fakemodel.WhoLikeYouModel

object Mock {
    fun getOnboardingPageList(): List<OnboardingPagerModel> {
        val model = OnboardingPagerModel(
            "Anonim Mesaj",
            R.drawable.ic_onboarding_first,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text"
        )
        val model1 = OnboardingPagerModel(
            "Eşleştirme",
            R.drawable.ic_onboarding_second,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text"
        )
        val model2 = OnboardingPagerModel(
            "Keşfet",
            R.drawable.ic_onboarding_third,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text"
        )

        val list = ArrayList<OnboardingPagerModel>()
        list.add(model)
        list.add(model1)
        list.add(model2)
        return list
    }

    fun getHobbyList(): List<HobbyModel> {
        val model = HobbyModel("Yüzmek")
        val model1 = HobbyModel("Futbol")
        val model2 = HobbyModel("Basketbol")
        val model3 = HobbyModel("Şarap İçmek")
        val model4 = HobbyModel("Dümen Yapmak")
        val model5 = HobbyModel("Bira İçmek")
        val model6 = HobbyModel("Konsere Gitmek")

        val list = ArrayList<HobbyModel>()
        list.add(model)
        list.add(model1)
        list.add(model2)
        list.add(model3)
        list.add(model4)
        list.add(model5)
        list.add(model6)
        return list
    }

    fun getWhoLikeYouList(): List<WhoLikeYouModel> {
        val model = WhoLikeYouModel("Sultan Köse",R.drawable.fake_1,0)
        val model1 = WhoLikeYouModel("Suzan Topçu",R.drawable.fake_2,0)
        val model2 = WhoLikeYouModel("Mine Leyli",R.drawable.fake_3,1)
        val model3 = WhoLikeYouModel("Korhan Top",R.drawable.fake_4,0)
        val model4 = WhoLikeYouModel("Dümen Yapmak",R.drawable.fake_5,0)
        val model5 = WhoLikeYouModel("Bira İçmek",R.drawable.fake_6,0)

        val list = ArrayList<WhoLikeYouModel>()
        list.add(model)
        list.add(model1)
        list.add(model2)
        list.add(model3)
        list.add(model4)
        list.add(model5)
        return list
    }
}