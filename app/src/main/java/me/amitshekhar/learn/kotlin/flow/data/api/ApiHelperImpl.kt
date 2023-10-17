package me.amitshekhar.learn.kotlin.flow.data.api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import me.amitshekhar.learn.kotlin.flow.data.model.ApiUser

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override fun getUsers(): Flow<List<ApiUser>> {
        return flow { emit(apiService.getUsers()) }
    }

    override fun getMoreUsers() = flow { emit(apiService.getMoreUsers()) }

    override fun getUsersWithError() = flow { emit(apiService.getUsersWithError()) }

}