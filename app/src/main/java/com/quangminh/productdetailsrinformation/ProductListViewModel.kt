package com.quangminh.productdetailsrinformation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quangminh.productdetailsrinformation.ApiClient.apiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductListViewModel : ViewModel() {
    private val _productList = MutableLiveData<List<Product>>()
    val productList: LiveData<List<Product>> = _productList

    val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> = _errorMessage

    init {
        fetchProductList()
    }

     fun fetchProductList() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = apiService.getProductsList()
                _productList.postValue(response.products)
            } catch (e: Exception) {
                _errorMessage.postValue(e.message)

            }
        }
    }

}

