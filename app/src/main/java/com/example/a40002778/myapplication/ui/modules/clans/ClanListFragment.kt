package com.example.a40002778.myapplication.ui.modules.clans

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.a40002778.myapplication.R
import com.example.a40002778.myapplication.data.model.Clan
import com.example.a40002778.myapplication.ui.components.EmptyViewClickListener
import com.example.a40002778.myapplication.ui.components.ListItemClickListener

class ClanListFragment : Fragment() {

    private var columnCount = 1
    private var listener: ClanListFragmentInteractionListener? = null
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
                adapter = ClanListRecyclerAdapter(listOf(
                    Clan(1,"one"),
                    Clan(2, "Two"),
                    Clan(3, "Three")
                ),listener)
            }
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ClanListViewModel::class.java)
        // TODO: Use the ViewModel
    }

    interface ClanListFragmentInteractionListener {
        fun onListFragmentInteraction(item: Clan?)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ClanListFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnListFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}
