package com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.repo

import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.data.remote.GameService
import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain.items.GameItem
import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain.items.SpecificGameItem
import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain.items.toGameItem
import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain.items.toSpecificGameItem
import javax.inject.Inject

/**
 * Created by Jorge Sanaguaray
 */

class GameRepository @Inject constructor(private val gameService: GameService) {

    suspend fun getGames(): List<GameItem> {

        return gameService.getGames().map {
            it.toGameItem()
        }

    }

    suspend fun getGameById(id: Int): SpecificGameItem {

        return gameService.getGameById(id).toSpecificGameItem()

    }

}