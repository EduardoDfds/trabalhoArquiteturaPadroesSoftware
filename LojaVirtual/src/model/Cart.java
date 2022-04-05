package model;

import java.util.Date;

public class Cart {
	private String cod;
	private Date dateBuy = new Date();
	private Client cliente;
	
	public Date getDateBuy() {
		return dateBuy;
	}
	public Client getCliente() {
		return cliente;
	}
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
}
