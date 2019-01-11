package com.example.a40002778.myapplication.ui.modules.clans

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.a40002778.myapplication.R
import com.example.a40002778.myapplication.data.model.Clan
import kotlinx.android.synthetic.main.fragment_item.view.*

class ClanListRecyclerAdapter(private val values: List<Clan>, private val mListener: ClanListFragment.ClanListFragmentInteractionListener?) : RecyclerView.Adapter<ClanListRecyclerAdapter.ViewHolder>() {
    private val onClickListener: View.OnClickListener

    init {
        onClickListener = View.OnClickListener { v ->
            val item = v.tag as Clan
            // Notify the active callbacks interface (the activity, if the fragment is attached to
            // one) that an item has been selected.
            mListener?.onListFragmentInteraction(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.mIdView.text = item.id.toString()
        holder.mContentView.text = item.content

        with(holder.mView) {
            tag = item
            setOnClickListener(onClickListener)
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: TextView = mView.item_number
        val mContentView: TextView = mView.content

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }


}