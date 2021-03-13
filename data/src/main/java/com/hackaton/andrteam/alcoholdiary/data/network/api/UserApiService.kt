package com.hackaton.andrteam.alcoholdiary.data.network.api

import com.hackaton.andrteam.alcoholdiary.data.network.entity.User

interface UserApiService {

    fun getUser(): User
}