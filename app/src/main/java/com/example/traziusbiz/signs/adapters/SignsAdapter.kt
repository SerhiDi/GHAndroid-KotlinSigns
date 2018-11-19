package com.example.traziusbiz.signs.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.traziusbiz.signs.R
import com.example.traziusbiz.signs.entities.Sign

class SignsAdapter(private val items: List<Sign>) : RecyclerView.Adapter<SignsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val signView = R.layout.sign_item
        val view = LayoutInflater.from(parent.context).inflate(signView, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.signName.text = items[position].name
        holder.signImage.setImageResource(items[position].imageId)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val signName: TextView
        val signImage: ImageView

        init {
            signName = itemView.findViewById(R.id.sign_name)
            signImage = itemView.findViewById(R.id.sign_image)
        }
    }
}