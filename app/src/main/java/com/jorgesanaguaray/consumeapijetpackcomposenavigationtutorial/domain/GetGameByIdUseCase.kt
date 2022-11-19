package com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain

import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.domain.items.SpecificGameItem
import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.repo.GameRepository
import javax.inject.Inject

/**
 * Created by Jorge Sanaguaray
 */

class GetGameByIdUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(id: Int): SpecificGameItem {

        return gameRepository.getGameById(id)

    }

}