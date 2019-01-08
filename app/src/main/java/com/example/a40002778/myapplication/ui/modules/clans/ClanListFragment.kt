package com.example.a40002778.myapplication.ui.modules.clans

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.a40002778.myapplication.R

class ClanListFragment : Fragment() {

    private var columnCount = 1

    companion object {
        const val ARG_COLUMN_COUNT = "column-count"
        @JvmStatic
        fun newInstance(columnCount : Int) =
            ClanListFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }

    private lateinit var viewModel: ClanListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.clan_list_fragment, container, false)
        if(view is RecyclerView){
            with(view){
                layoutManager = when{
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context,columnCount)
                }
                adapter = MyItemRecyclerViewAdapter(DummyContent.ITEMS, listener)
            }
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ClanListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
