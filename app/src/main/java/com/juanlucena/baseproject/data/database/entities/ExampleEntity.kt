package com.juanlucena.baseproject.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exampleEntity")
data class ExampleEntity (

    @PrimaryKey val exampleId: Int,
    @ColumnInfo(name = "example_name") val exampleName: String,
)