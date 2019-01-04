package com.example.a40002778.myapplication.ui.clans

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.a40002778.myapplication.R

class ClanListFragment : Fragment() {

    companion object {
        fun newInstance() = ClanListFragment()
    }

    private lateinit var viewModel: ClanListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.clan_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ClanListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
