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
            ItemData("Parent 1", listOf(
                ItemData.ChildItem("Child 1", "Nick 1"),
                ItemData.ChildItem("Child 1", "Nick 1"),
                ItemData.ChildItem("Child 1", "Nick 1"),
                ItemData.ChildItem("Child 1", "Nick 1"),
                ItemData.ChildItem("Child 1", "Nick 1"),
                ItemData.ChildItem("Child 1", "Nick 1"),
                ItemData.ChildItem("Child 2", "Nick 2")
            )),
            ItemData("Parent 2", listOf(
                ItemData.ChildItem("Child 3", "Nick 3"),
                ItemData.ChildItem("Child 4", "Nick 4")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 5"),
                ItemData.ChildItem("Child 6", "Nick 6")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 7"),
                ItemData.ChildItem("Child 5", "Nick 7"),
                ItemData.ChildItem("Child 5", "Nick 7"),
                ItemData.ChildItem("Child 5", "Nick 7"),
                ItemData.ChildItem("Child 5", "Nick 7"),
                ItemData.ChildItem("Child 5", "Nick 7"),
                ItemData.ChildItem("Child 5", "Nick 7"),
                ItemData.ChildItem("Child 6", "Nick 8")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 9"),
                ItemData.ChildItem("Child 6", "Nick 10")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 11"),
                ItemData.ChildItem("Child 6", "Nick 12")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 13"),
                ItemData.ChildItem("Child 6", "Nick 14")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 5"),
                ItemData.ChildItem("Child 6", "Nick 6")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 5"),
                ItemData.ChildItem("Child 6", "Nick 6")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 5"),
                ItemData.ChildItem("Child 6", "Nick 6")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 5"),
                ItemData.ChildItem("Child 6", "Nick 6")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 5"),
                ItemData.ChildItem("Child 6", "Nick 6")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 5"),
                ItemData.ChildItem("Child 6", "Nick 6")
            )),
            ItemData("Parent 3", listOf(
                ItemData.ChildItem("Child 5", "Nick 5"),
                ItemData.ChildItem("Child 6", "Nick 6")
            ))
            // Add more items as needed
        )
    }

}