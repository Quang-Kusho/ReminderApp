package com.ilovecandy.reminderapllication

import android.content.Context
import androidx.room.Room
import com.ilovecandy.reminderapllication.datastore.repository.AccountRepository
import com.ilovecandy.reminderapllication.datastore.room.ReminderAppDatabase

/**
 * A simple singleton dependency graph
 *
 * For a real app, please use something like Koin/Dagger/Hilt instead
 */
object Graph {
    lateinit var database: ReminderAppDatabase

    lateinit var appContext: Context

    val accountRepository by lazy {
        AccountRepository(
            accountDao = database.accountDao()
        )
    }

    fun provide(context: Context) {
        appContext = context
        database = Room.databaseBuilder(context, ReminderAppDatabase::class.java, "mcData.db")
            .fallbackToDestructiveMigration() // don't use this in production app
            .build()
    }
}