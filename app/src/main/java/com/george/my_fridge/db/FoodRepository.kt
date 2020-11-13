package com.george.my_fridge.db

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class FoodRepository(private val wordDao: FoodDao) {
    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allWords: Flow<List<Products>> = wordDao.getAlphabetizedWords()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(products: Products) {
        wordDao.insert(products)
    }

}