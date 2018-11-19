package com.example.traziusbiz.signs.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.traziusbiz.signs.R
import com.example.traziusbiz.signs.adapters.SignsAdapter
import com.example.traziusbiz.signs.data.SIGNS
import kotlinx.android.synthetic.main.recycler_view.view.*

class SignsFragment : Fragment() {
    val NUMBER_OF_COLUMNS: Int = 3

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.recycler_view, container, false)

        val recycler = view.recycler_view
        recycler.layoutManager = GridLayoutManager(context, NUMBER_OF_COLUMNS)
        recycler.adapter = SignsAdapter(SIGNS)

        return view
    }

}