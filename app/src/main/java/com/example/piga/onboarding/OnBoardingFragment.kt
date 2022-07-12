package com.example.piga.onboarding

import androidx.core.view.isVisible
import androidx.viewpager2.widget.ViewPager2
import com.example.piga.R
import com.example.piga.base.BaseFragment
import com.example.piga.databinding.FragmentOnboardingBinding
import com.example.piga.onboarding.adapter.OnboardingPagerAdapter
import com.example.piga.util.Mock
import com.example.piga.util.setSafeOnClickListener
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingFragment :
    BaseFragment<FragmentOnboardingBinding>(FragmentOnboardingBinding::inflate) {

    private lateinit var adapter: OnboardingPagerAdapter

    private val onPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)

            if (position == Mock.getOnboardingPageList().size - 1) {
                binding.btnNext.text = getString(R.string.text_finish)
            } else {
                binding.btnNext.text = getString(R.string.text_resume)
            }
        }
    }

    override fun init() {
        adapter = OnboardingPagerAdapter(Mock.getOnboardingPageList())
        binding.apply {
            vpOnBoardingPage.adapter = adapter
        }
        TabLayoutMediator(binding.pageIndicator, binding.vpOnBoardingPage) { _, _ -> }.attach()
        binding.btnNext.setSafeOnClickListener {
            if (binding.vpOnBoardingPage.currentItem > binding.vpOnBoardingPage.childCount) {
                //findNavController().navigate(R.id.action_onBoardingFragment_to_loginFragment)
            } else {
                binding.vpOnBoardingPage.setCurrentItem(
                    binding.vpOnBoardingPage.currentItem + 1,
                    true
                )
            }
        }
    }

    override fun onStart() {
        super.onStart()
        binding.vpOnBoardingPage.registerOnPageChangeCallback(onPageChangeCallback)
    }

    override fun onStop() {
        super.onStop()
        binding.vpOnBoardingPage.unregisterOnPageChangeCallback(onPageChangeCallback)
    }

}