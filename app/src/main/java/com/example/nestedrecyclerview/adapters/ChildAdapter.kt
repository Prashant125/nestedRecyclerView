package com.example.nestedrecyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.model.ItemData

class ChildAdapter : ListAdapter<ItemData.ChildItem, ChildAdapter.ChildViewHolder>(DiffCallback) {

    object DiffCallback : DiffUtil.ItemCallback<ItemData.ChildItem>() {
        override fun areItemsTheSame(oldItem: ItemData.ChildItem, newItem: ItemData.ChildItem): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: ItemData.ChildItem, newItem: ItemData.ChildItem): Boolean =
            oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.child_item_layout, parent, false)
        return ChildViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val childData = getItem(position)

        // Bind data
        holder.textView1.text = childData.name
        holder.textView2.text = childData.nickName
    }

    inner class ChildViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1: TextView = itemView.findViewById(R.id.textView1)
        val textView2: TextView = itemView.findViewById(R.id.textView2)
    }
}
