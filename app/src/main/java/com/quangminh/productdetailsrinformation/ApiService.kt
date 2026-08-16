package com.quangminh.productdetailsrinformation

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("products/{id}")
    suspend fun getCurrentProductDetails(
        @Path(value = "id") id: Int = 1
    ): CurrentProductDetails
}