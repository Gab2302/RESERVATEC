package com.vera.gabriel.reservatec1.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vera.gabriel.reservatec1.databinding.ItemFieldBinding

class FieldAdapter(private val fieldList: List<String>, private val imageList: List<Int>) : RecyclerView.Adapter<FieldAdapter.FieldViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FieldViewHolder {
        val binding = ItemFieldBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FieldViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FieldViewHolder, position: Int) {
        val fieldName = fieldList[position]
        val fieldImage = imageList[position]
        holder.bind(fieldName, fieldImage)
    }

    override fun getItemCount(): Int = fieldList.size

    class FieldViewHolder(private val binding: ItemFieldBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fieldName: String, fieldImage: Int) {
            binding.tvFieldName.text = fieldName
            binding.ivField.setImageResource(fieldImage)
        }
    }
}
