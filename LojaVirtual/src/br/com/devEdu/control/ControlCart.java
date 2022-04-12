package br.com.devEdu.control;

import java.util.ArrayList;
import java.util.List;

import br.com.devEdu.model.Cart;
import br.com.devEdu.model.CartItems;
import br.com.devEdu.model.Product;

public class ControlCart {
	private List<CartItems> cartItems =new ArrayList<CartItems>();

	public void addItemsToCart(Cart cart,Product product, Double unitaryValue, Double amount) {
		CartItems items = new CartItems(); 
		items.setAmount(amount);
		items.setProduct(product);
		items.setUnitaryValue(unitaryValue);
		items.setCart(cart);
		cartItems.add(items);
	}
	
	public void removeItemsToCart() {
		
	}
	@Override
	public String toString() {
		String cartString = "";
		for( int i = 0; i < cartItems.size(); i++) {
			CartItems cart = cartItems.get(i);
			cart.getAmount();
			cart.getProduct();
			cart.getUnitaryValue();
			cart.getCart();
			
			cartString =(String.valueOf(cart.getAmount()) + String.valueOf(cart.getProduct()) + String.valueOf(cart.getUnitaryValue()) + String.valueOf(cart.getCart()));
		}
		//quantidade adicionada
		//valor unitario
		//valor total
		//mostrar o cliente
		return cartString;
	}
}
