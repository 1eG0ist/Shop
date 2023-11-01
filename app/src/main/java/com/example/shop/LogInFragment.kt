package com.example.shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shop.databinding.ActivityMainBinding
import com.example.shop.databinding.FragmentLogInBinding

class LogInFragment : Fragment() {
    private var _binding: FragmentLogInBinding? = null
    private val binding: FragmentLogInBinding get() = _binding!!
    private var stateNow = "in"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLogInBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.signInButton.setOnClickListener {
            if (stateNow == "up") {
                binding.signInArea.visibility = View.VISIBLE
                binding.acceptSignInButtonArea.visibility = View.VISIBLE
                binding.signUpArea.visibility = View.INVISIBLE
                binding.acceptSignUpButtonArea.visibility = View.INVISIBLE
                stateNow = "in"
            }
        }
        binding.signUpButton.setOnClickListener {
            if (stateNow == "in") {
                binding.signInArea.visibility = View.INVISIBLE
                binding.acceptSignInButtonArea.visibility = View.INVISIBLE
                binding.signUpArea.visibility = View.VISIBLE
                binding.acceptSignUpButtonArea.visibility = View.VISIBLE
                stateNow = "up"
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}