package com.example.services;


import java.util.List;

import com.example.dtos.CartRequestDto;
import com.example.dtos.CartUpdateRequestDto;
import com.example.dtos.CartViewDto;

public interface CartService {

	String addProductToCart(CartRequestDto cartRequestDto);
	List<CartViewDto> getCartDetailsByUserId(int userId);
	void updateCartQuantities(List<CartUpdateRequestDto> updates);
	void deleteCartItem(int cartDetailId);
}
