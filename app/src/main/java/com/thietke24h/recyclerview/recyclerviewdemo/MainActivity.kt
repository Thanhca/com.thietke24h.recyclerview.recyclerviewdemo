package com.thietke24h.recyclerview.recyclerviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
/**
 * Created by thietke24h.com on 6/27/2018.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.layoutManager = LinearLayoutManager(this)
        list.hasFixedSize()
        list.adapter = ListAdapter(this, getLists())


    }

    fun getLists(): ArrayList<String> {
        var lists = ArrayList<String>()

        lists.add("thietke24.com")
        lists.add("thiet ke logo")
        lists.add("thiet ke banner")
        lists.add("thiet ke app android")
        lists.add("thiet ke app ios")
        return lists
    }
}
