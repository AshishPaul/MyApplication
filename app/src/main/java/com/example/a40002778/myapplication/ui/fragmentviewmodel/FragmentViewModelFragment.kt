package com.example.a40002778.myapplication.ui.fragmentviewmodel

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a40002778.myapplication.R

class FragmentViewModelFragment : Fragment() {

    companion object {
        fun newInstance() = FragmentViewModelFragment()
    }

    private lateinit var viewModel: FragmentViewModelViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_view_model_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentViewModelViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
