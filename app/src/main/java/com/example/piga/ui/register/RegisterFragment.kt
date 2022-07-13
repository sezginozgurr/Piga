package com.example.piga.ui.register

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.navigation.fragment.findNavController
import com.example.piga.R
import com.example.piga.base.BaseFragment
import com.example.piga.databinding.FragmentRegisterBinding
import com.example.piga.util.setSafeOnClickListener
import java.text.SimpleDateFormat
import java.util.*

class RegisterFragment : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {
    override fun init() {
        binding.buttonRegister.setSafeOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }
        val calender = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
            calender.set(Calendar.YEAR, year)
            calender.set(Calendar.MONTH, month)
            calender.set(Calendar.DAY_OF_MONTH, day)
            updateLabel(datePicker)
        }
        binding.date.setSafeOnClickListener {
            DatePickerDialog(
                requireContext(),
                datePicker,
                calender.get(Calendar.YEAR),
                calender.get(Calendar.MONTH),
                calender.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
    }

    private fun updateLabel(datePicker: DatePicker?) {
        val format = "dd-MM-yyyy"
        val simpleDateFormat = SimpleDateFormat(format, Locale.US)
        //binding.date.setText(simpleDateFormat.format(datePicker.time))
    }

}