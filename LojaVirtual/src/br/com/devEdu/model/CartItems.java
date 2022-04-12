package br.com.devEdu.model;

public class CartItems {
	private Cart cart;
	private Product product;
	private Double amount;
	private Double unitaryValue;
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getUnitaryValue() {
		return unitaryValue;
	}
	public void setUnitaryValue(Double unitaryValue) {
		this.unitaryValue = unitaryValue;
	}
}
