package com.example.piga.ui.login

import androidx.navigation.fragment.findNavController
import com.example.piga.R
import com.example.piga.base.BaseFragment
import com.example.piga.databinding.FragmentLoginBinding
import com.example.piga.util.setSafeOnClickListener


class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    override fun init() {
        binding.buttonLogin.setSafeOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }
    }

}