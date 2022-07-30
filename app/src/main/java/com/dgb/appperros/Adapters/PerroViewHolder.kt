package com.dgb.appperros.Adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.dgb.appperros.databinding.ItemPerroBinding
import com.squareup.picasso.Picasso

class PerroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemPerroBinding.bind(view)

    fun bind(image:String){
        Picasso.get().load(image).into(binding.ivDog)
    }
}