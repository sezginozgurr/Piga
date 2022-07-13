package com.example.piga.ui.login

import androidx.navigation.fragment.findNavController
import com.example.piga.R
import com.example.piga.base.BaseFragment
import com.example.piga.databinding.FragmentBeforeLoginBinding
import com.example.piga.util.setSafeOnClickListener

class BeforeLoginFragment :
    BaseFragment<FragmentBeforeLoginBinding>(FragmentBeforeLoginBinding::inflate) {

    override fun init() {
        binding.buttonLogin.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }
        binding.buttonRegister.setSafeOnClickListener {
            findNavController().navigate(R.id.registerFragment)
        }
    }

}