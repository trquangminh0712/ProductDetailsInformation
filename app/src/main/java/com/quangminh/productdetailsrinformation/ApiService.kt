package com.quangminh.productdetailsrinformation

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("product")
   suspend fun getCurrentProductDetails(
       @Query("id") id : Int,
       @Query("title") title: String,
       @Query("description") description: String,
       @Query("price") price: Double,
       @Query("discountPercentage") discountPercentage: Double,
       @Query("rating") rating: Double,
       @Query("stock") stock: Int,
       @Query("brand") brand: String,
       @Query("sku") sku: String,
       @Query("weight") weight: Int,
       @Query("warrantyInformation") warrantyInformation: String,
       @Query("shippingInformation") shippingInformation: String,
       @Query("availabilityStatus") availabilityStatus: String,
       @Query("reviews") reviews: String = "comment,reviewerName,rating",



   ): CurrentProductDetails
}