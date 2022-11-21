package com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain.items

import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.data.remote.models.SpecificGameModel

/**
 * Created by Jorge Sanaguaray
 */

data class SpecificGameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val description: String

)

fun SpecificGameModel.toSpecificGameItem() = SpecificGameItem(id, title, thumbnail, description)
