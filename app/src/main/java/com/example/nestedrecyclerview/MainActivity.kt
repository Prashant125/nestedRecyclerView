package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.adapters.ItemAdapter
import com.example.nestedrecyclerview.model.ItemData

class MainActivity : AppCompatActivity() {

    private lateinit var parentRecyclerView: RecyclerView
    private lateinit var parentAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView and ParentAdapter
        parentRecyclerView = findViewById(R.id.parent_recycler_view)
        parentAdapter = ItemAdapter()
        parentAdapter.submitList(getDummyData())

        // Set up LinearLayoutManager for the RecyclerView
        parentRecyclerView.layoutManager = LinearLayoutManager(this)

        // Attach the ParentAdapter to the RecyclerView
        parentRecyclerView.adapter = parentAdapter
    }

    private fun getDummyData(): List<ItemData> {
        return listOf(
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 1", listOf("Child 1", "Child 2","Child 2","Child 2","Child 2","Child 2","Child 2")),
            ItemData("Parent 2", listOf("Child 3", "Child 4")),
            ItemData("Parent 3", listOf("Child 5", "Child 6"))
            // Add more items as needed
        )
    }
}