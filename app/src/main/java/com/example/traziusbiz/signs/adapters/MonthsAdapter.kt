package com.example.traziusbiz.signs.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.traziusbiz.signs.R
import com.example.traziusbiz.signs.entities.Month

class MonthsAdapter(private val items: List<Month>) : RecyclerView.Adapter<MonthsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val monthView = R.layout.month_item
        val view = LayoutInflater.from(parent.context).inflate(monthView, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.monthName.text = items[position].name
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val monthName: TextView

        init {
            monthName = itemView.findViewById(R.id.month_name)
        }
    }
}