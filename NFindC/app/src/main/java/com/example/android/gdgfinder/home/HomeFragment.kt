/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.gdgfinder.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.android.gdgfinder.R
import com.example.android.gdgfinder.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding = HomeFragmentBinding.inflate(inflater)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        binding.viewModel = viewModel

        viewModel.navigateToSearch.observe(viewLifecycleOwner,
                Observer<Boolean> { navigate ->
                    if(navigate) {
                        val navController = findNavController()
                        navController.navigate(R.id.action_homeFragment_to_gdgListFragment)
                        viewModel.onNavigatedToSearch()
                    }
                })

        return binding.root
    }

    // Stuff to add for Prototype:

    //// Vibration

    // Activated or not? E.g. Button to activate vibration etc, e.g. in settings or ask each time

    // Kind of vibration style?
    // Intensity
    // Frequency
        // Patterns



    // Popover for question about proximity vibration

    // Press and hold to see money on account


    //// Authentication Presets

    // Choose card from presets
        // change layout of presets depending on how many you have
    // Create presets?
    // Search presets?


    //// ID
    // Face ID. Exists on android?
    // Bank id?
    // Friend Id? Just as a concept


    // Notification when at store

    //

}
