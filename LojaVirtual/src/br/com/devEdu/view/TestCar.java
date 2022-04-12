package br.com.devEdu.view;

import br.com.devEdu.control.ControlCart;
import br.com.devEdu.model.Cart;
import br.com.devEdu.model.Client;
import br.com.devEdu.model.Product;

public class TestCar {

	public static void main(String[] args) {

		Client client1 = new Client();
		client1.setCpf("09500996944");
		client1.setAdress("Rua das flores");
		client1.setEmail("aaaabbbb");
		client1.setName("Edu");
		client1.setSenha("123");
		
		Product product1 = new Product();
		product1.setCode("1");
		product1.setDescription("4 bocas");
		product1.setInventory(1);
		product1.setNome("fogão");
		product1.setValue(150.);
		
		Product product2 = new Product();
		product2.setCode("2");
		product2.setDescription("120 mega");
		product2.setInventory(1);
		product2.setNome("pc");
		product2.setValue(1500.);
		
		Cart cart1 = new Cart();
		cart1.setCliente(client1);
		cart1.setCod("1");
		
		ControlCart controlCart1 = new ControlCart();
		controlCart1.addItemsToCart(cart1, product1, 33., 3.);
		controlCart1.addItemsToCart(cart1, product2, 3., 35.);
		
		System.out.println(controlCart1);
		
		}

}
