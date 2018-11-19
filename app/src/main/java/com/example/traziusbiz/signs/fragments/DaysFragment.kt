package com.example.traziusbiz.signs.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.traziusbiz.signs.R
import kotlinx.android.synthetic.main.days_fragment.view.*


class DaysFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.days_fragment, container, false)

        return view
    }

}