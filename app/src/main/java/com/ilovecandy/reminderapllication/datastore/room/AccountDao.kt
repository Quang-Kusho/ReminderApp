package com.ilovecandy.reminderapllication.datastore.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.ilovecandy.reminderapllication.datastore.entity.Account
import androidx.room.Query
import androidx.room.Update

@Dao
interface AccountDao {

    @Query("SELECT * FROM account WHERE username = :username")
    fun getPassword(username: String): String

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insert(entity: Account)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(password: String)

    @Delete
    suspend fun delete(username: String): Int
}