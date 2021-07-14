package com.chuks.fragmentmanager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chuks.fragmentmanager.R
import com.chuks.fragmentmanager.databinding.ActivityMainBinding
import com.chuks.fragmentmanager.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

   
}