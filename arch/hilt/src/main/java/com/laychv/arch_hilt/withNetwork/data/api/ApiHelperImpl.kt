package com.laychv.arch_hilt.withNetwork.data.api

import com.laychv.arch_hilt.withNetwork.data.model.User
import retrofit2.Response
import javax.inject.Inject

/**
 * 把ApiService注入到ApiHelperImpl中
 */

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUser(): Response<List<User>> = apiService.getUser()
}