package com.example.nestedrecyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.model.ItemData
class ItemAdapter : ListAdapter<ItemData, ItemAdapter.ItemViewHolder>(DiffCallback) {

    object DiffCallback : DiffUtil.ItemCallback<ItemData>() {
        override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean =
            oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemData = getItem(position)

        // Bind data
        holder.titleTextView.text = itemData.title

        // Bind child RecyclerView data using its adapter
        holder.childAdapter.submitList(itemData.childList)
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.childRecyclerView)
        val childAdapter = ChildAdapter()

        init {
            childRecyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            childRecyclerView.adapter = childAdapter
        }
    }
}
