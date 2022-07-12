package com.example.piga.util

import com.example.piga.R
import com.example.piga.data.OnboardingPagerModel

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
}