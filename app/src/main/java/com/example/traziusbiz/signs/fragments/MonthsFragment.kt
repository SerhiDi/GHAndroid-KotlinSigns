package com.example.traziusbiz.signs.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.traziusbiz.signs.R
import com.example.traziusbiz.signs.adapters.MonthsAdapter
import com.example.traziusbiz.signs.data.MONTHS
import kotlinx.android.synthetic.main.recycler_view.view.*

class MonthsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.recycler_view, container, false)

        val recycler = view.recycler_view
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = MonthsAdapter(MONTHS)
        val decoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        recycler.addItemDecoration(decoration)

        return view
    }

}