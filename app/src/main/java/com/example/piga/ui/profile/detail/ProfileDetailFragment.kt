package com.example.piga.ui.profile.detail

import com.example.piga.base.BaseFragment
import com.example.piga.databinding.FragmentProfileDetailBinding
import com.example.piga.ui.profile.detail.adapter.HobbysListAdapter
import com.example.piga.util.Mock

class ProfileDetailFragment() :
    BaseFragment<FragmentProfileDetailBinding>(FragmentProfileDetailBinding::inflate) {

    private val hobbyAdapter by lazy { HobbysListAdapter() }

    override fun init() {
        hobbyAdapter.items = Mock.getHobbyList()
        binding.recyclerHobby.adapter = hobbyAdapter
    }


}