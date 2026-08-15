package com.quangminh.productdetailsrinformation

import android.R
import com.google.android.libraries.places.api.model.Review

data class CurrentProductDetails(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Int,
    val brand: String,
    val reviews: List<Review> = emptyList(),
    val thumbnail: String,
)
data class Reviews(
    val rating: Double,
    val comment: String,
    val reviewerName: String

)
