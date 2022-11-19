package com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain

import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain.items.GameItem
import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.repo.GameRepository
import javax.inject.Inject

/**
 * Created by Jorge Sanaguaray
 */

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem> {

        return gameRepository.getGames().shuffled()

    }

}