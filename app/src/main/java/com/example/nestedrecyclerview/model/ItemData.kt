package com.example.nestedrecyclerview.model

data class ItemData(val title: String, val childList: List<ChildItem>) {

    data class ChildItem(val name: String, val nickName: String)

}


