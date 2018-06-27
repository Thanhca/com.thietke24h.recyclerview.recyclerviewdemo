package com.thietke24h.recyclerview.recyclerviewdemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.list_layout.view.*

/**
 * Created by thietke24h.com on 6/27/2018.
 */

class ListAdapter(var c: Context, var lists: ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val mycont: Context? = null
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var v = LayoutInflater.from(c).inflate(R.layout.list_layout, parent, false)
        return Item(v, c)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int, payloads: MutableList<Any>) {
        (holder as Item).bindData(lists[position])
    }

    class Item(itemView: View, var c: Context) : RecyclerView.ViewHolder(itemView) {
        fun bindData(_list: String) {
            itemView.textView.text = _list
            itemView.setOnClickListener {
                Toast.makeText(c, "" + _list, Toast.LENGTH_LONG).show()
            }
        }
    }
}