package com.quangminh.productdetailsrinformation

import android.R
import com.google.android.libraries.places.api.model.Review
import kotlin.math.round

data class CurrentProductDetails(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val discountPercentage: Double,
    val priceBeforeDiscount: Double = round(price + (price * discountPercentage / 100)),
    val rating: Double,
    val stock: Int,
    val brand: String,
    val reviews: List<Reviews> = emptyList(),
    val thumbnail: String,
    val sku: String,
    val weight: Double,
    val shippingInformation : String,
    val warrantyInformation: String,
    val returnPolicy: String
)
data class Reviews(
    val rating: Double,
    val comment: String,
    val reviewerName: String

)


