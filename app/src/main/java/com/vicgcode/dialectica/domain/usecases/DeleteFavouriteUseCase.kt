package com.vicgcode.dialectica.domain.usecases

import com.vicgcode.dialectica.data.models.entity.DialectQuestion
import com.vicgcode.dialectica.database.room.AppRoomRepository

class DeleteFavouriteUseCase(
    private val appRoomRepository: AppRoomRepository
) {
    suspend operator fun invoke(question: DialectQuestion?) =
        appRoomRepository.deleteFavourite(question)
}