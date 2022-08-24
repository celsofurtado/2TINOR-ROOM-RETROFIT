package br.com.fiap.gameslistprof.repository

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class GameDatabase: RoomDatabase() {

    abstract fun gameDao(): GameDAO

    private lateinit var instance: GameDatabase

    // Singleton
    fun getDatabase(context: Context): GameDatabase {
        if (!::instance.isInitialized) {
            instance = Room
                .databaseBuilder(context, GameDatabase::class.java, "game_db")
                .build()
        }

        return instance
    }

}