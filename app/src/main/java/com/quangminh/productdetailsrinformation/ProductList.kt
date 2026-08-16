package com.quangminh.productdetailsrinformation

data class Product (
    val id : Int,
    val title : String,
    val brand : String,
    val category : String,
    val rating : Double,
    val price : Double,
    val discountPercentage: Double,
    val thumbnail: String,
)
data class ProductList(
    val products : List<Product>
)

