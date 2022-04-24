package com.example.privatebank.ui.base

import androidx.fragment.app.Fragment
import com.example.privatebank.R


const val BACK_STACK = "backStack"

abstract class BaseFragment: Fragment() {

    fun addFragment(fragment:Fragment){
        parentFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer,fragment)
            .addToBackStack(BACK_STACK)
            .commit()
    }
}