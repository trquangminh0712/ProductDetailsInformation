package com.quangminh.productdetailsrinformation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quangminh.productdetailsrinformation.ApiClient.apiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductDetailsViewModel : ViewModel() {
    private val _currentProductDetails = MutableLiveData<CurrentProductDetails>()
    val currentProductDetails: LiveData<CurrentProductDetails> = _currentProductDetails

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> = _errorMessage

    init {
        fetchCurrentProductDetails(1)
    }


    fun fetchCurrentProductDetails(productId: Int) {
        viewModelScope.launch {(Dispatchers.IO)
            try {
                val response = apiService.getCurrentProductDetails(productId)
                _currentProductDetails.value =(response)
            } catch (e: Exception) {
                _errorMessage.value =(e.message)
            }
        }
    }

    fun getProductById(id: Int) {
        viewModelScope.launch {
            try {
                val response = apiService.getCurrentProductDetails(id)
                _currentProductDetails.value = response // Cập nhật LiveData
            } catch (e: Exception) {
                e.printStackTrace() // In lỗi ra Logcat nếu API bị hỏng/lỗi mạng
                _errorMessage.value = e.message
            }
        }
    }
}
