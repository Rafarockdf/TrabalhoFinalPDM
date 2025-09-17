package com.example.estudotrabalhofinal.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Delete

@Dao
interface FoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(food: Food)

    @Query("SELECT * FROM foods WHERE id = :id LIMIT 1")
    suspend fun getFoodById(id: Int): Food?

    @Query("SELECT * FROM foods ORDER BY name ASC")
    suspend fun getAllFoods(): List<Food>

    @Delete
    suspend fun delete(food: Food)

    @Query("DELETE FROM foods")
    suspend fun deleteAllFoods()
}
