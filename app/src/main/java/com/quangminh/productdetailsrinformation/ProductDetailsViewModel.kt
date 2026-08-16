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
        fetchCurrentProductDetails()
    }


    private fun fetchCurrentProductDetails() {
        viewModelScope.launch {(Dispatchers.IO)
            try {
                val response = apiService.getCurrentProductDetails()
                _currentProductDetails.value =(response)
            } catch (e: Exception) {
                _errorMessage.value =(e.message)
            }
        }
    }
}
