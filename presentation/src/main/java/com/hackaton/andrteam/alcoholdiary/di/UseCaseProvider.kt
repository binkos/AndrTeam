package com.hackaton.andrteam.alcoholdiary.di

import com.hackaton.andrteam.alcoholdiary.domain.usecase.GetUserUseCase

object UseCaseProvider {

    fun provideGetUserUseCase(): GetUserUseCase =
        GetUserUseCase(RepositoryProvider.provideUserRepository())
}