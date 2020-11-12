package com.george.my_fridge.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {
    @Query("SELECT * FROM Products_list ORDER BY food ASC")

    fun getAlphabetizedWords(): Flow<List<Products>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(food: Products)

    @Query("DELETE FROM Products_list")
    suspend fun deleteAll()
}