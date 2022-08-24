package br.com.fiap.gameslistprof.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_game")
class Game {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var title: String = ""
    var studio: String = ""

    @ColumnInfo(name = "release_year")
    var releaseYear: Int = 0

    var description: String = ""

}