package com.example.traziusbiz.signs.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.traziusbiz.signs.R
import com.example.traziusbiz.signs.entities.Day

class DaysAdapter(private val items: List<Day>) : RecyclerView.Adapter<DaysAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val dayView = R.layout.day_item
        val view = LayoutInflater.from(parent.context).inflate(dayView, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dayName.text = items[position].name
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayName: TextView

        init {
            dayName = itemView.findViewById(R.id.day_name)
        }
    }
}