package com.ilovecandy.reminderapllication.datastore.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ilovecandy.reminderapllication.datastore.entity.Account

@Database(
    entities = [Account::class],
    version = 1,
    exportSchema = false
)
abstract class ReminderAppDatabase : RoomDatabase(){
    abstract fun accountDao(): AccountDao

    companion object{

        @Volatile
        private var INSTANCE : ReminderAppDatabase? = null

        fun getDatabase(context: Context): ReminderAppDatabase{

            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ReminderAppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}