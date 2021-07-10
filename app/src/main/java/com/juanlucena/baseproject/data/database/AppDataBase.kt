package com.juanlucena.baseproject.data.database

import android.content.Context
import androidx.room.Room

abstract class AppDataBase {

    //Todo: Dao Instance
    //abstract fun getExampleDaoInstance(): ExampleDao

    //Todo: Database instance
    /*companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "example_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }*/
}