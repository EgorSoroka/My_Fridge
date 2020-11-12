package com.george.my_fridge.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class Products(val products: String) {
    @Entity(tableName = "Products_list")
    class Products(@PrimaryKey(autoGenerate = true) val id: Int, @ColumnInfo(name = "food") val word: String)
}