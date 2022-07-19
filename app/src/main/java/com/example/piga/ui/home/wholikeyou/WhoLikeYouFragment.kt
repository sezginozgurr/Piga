package com.example.piga.ui.home.wholikeyou

import androidx.navigation.fragment.findNavController
import com.example.piga.R
import com.example.piga.base.BaseFragment
import com.example.piga.databinding.FragmentWhoLikeYouBinding
import com.example.piga.ui.home.wholikeyou.adapter.WhoLikeYouListAdapter
import com.example.piga.util.Mock

class WhoLikeYouFragment :
    BaseFragment<FragmentWhoLikeYouBinding>(FragmentWhoLikeYouBinding::inflate) {

    private val adapter by lazy {
        WhoLikeYouListAdapter {
            findNavController().navigate(R.id.profileDetailFragment)
        }
    }

    override fun init() {
        adapter.items = Mock.getWhoLikeYouList()
        binding.recyclerView.adapter = adapter
    }

}