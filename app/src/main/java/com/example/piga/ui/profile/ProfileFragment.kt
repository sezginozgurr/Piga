package com.example.piga.ui.profile

import androidx.navigation.fragment.findNavController
import com.example.piga.R
import com.example.piga.base.BaseFragment
import com.example.piga.databinding.FragmentProfileBinding
import com.example.piga.util.setSafeOnClickListener

class ProfileFragment : BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::inflate) {
    override fun init() {
        binding.imageProfile.setSafeOnClickListener {
            findNavController().navigate(R.id.profileDetailFragment)
        }
    }

}