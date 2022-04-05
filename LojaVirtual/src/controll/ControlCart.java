package controll;

import java.util.ArrayList;
import java.util.List;
import model.CartItems;
import model.Product;
import model.Cart;

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
		//descrição produto
		//quantidade adicionada
		//valor unitario
		//valor total
		//mostrar o cliente
		return "";
	}
}
