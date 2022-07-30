package com.dgb.appperros.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dgb.appperros.R

class PerroAdapter(private val images: List<String>) : RecyclerView.Adapter<PerroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PerroViewHolder(layoutInflater.inflate(R.layout.item_perro, parent, false))
    }

    override fun getItemCount(): Int = images.size


    override fun onBindViewHolder(holder: PerroViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }
}