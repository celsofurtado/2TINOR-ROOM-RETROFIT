package br.com.fiap.gameslistprof.repository

import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.gameslistprof.model.Game

interface GameDAO {

    // Save game
    @Insert
    fun save(game: Game): Long

    // Update Game
    @Update
    fun update(game: Game): Int

    // List all games
    @Query("SELECT * FROM tbl_game ORDER BY title")
    fun getAllGames(): List<Game>

    // Search for a game by id
    @Query("SELECT * FROM tbl_game WHERE id = :id")
    fun getGameById(id: Long): Game

}