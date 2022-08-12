package com.shoppi.app.ui.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.app.model.CartItem

class CartViewModel : ViewModel() {
    private val _items = MutableLiveData<List<CartItem>>()
    val items: LiveData<List<CartItem>> = _items


    // repository에 데이터를 요청하는 메소드
    fun loadCartItem(){
        _items.value

    }


}