package com.example.a40002778.myapplication.demos

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a40002778.myapplication.R

/**
 * A placeholder fragment containing a simple view.
 */
class Main2ActivityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main2, container, false)
    }
}
