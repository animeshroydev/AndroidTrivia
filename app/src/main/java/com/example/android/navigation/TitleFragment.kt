package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    // DONE TODO (01) Create the new TitleFragment
    // Select File->New->Fragment->Fragment (Blank)

    // DONE TODO (02) Clean up the new TitleFragment
    // In our new TitleFragment

    // DONE TODO (03) Use DataBindingUtil.inflate to inflate and return the titleFragment in onCreateView
    // In our new TitleFragment
    // R.layout.fragment_title

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title, container, false)

        // inflater.inflate(R.layout.fragment_title, container, false)
        return binding.root
    }



}