package com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain.items

import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.data.remote.models.GameModel

/**
 * Created by Jorge Sanaguaray
 */

data class GameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String

)

fun GameModel.toGameItem() = GameItem(id, title, thumbnail, short_description)
