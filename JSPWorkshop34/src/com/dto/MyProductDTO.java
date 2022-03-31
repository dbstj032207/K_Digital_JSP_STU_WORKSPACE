package com.dto;

public class MyProductDTO {

	private String prodId;
	private String prodName;
	private int price;
	private int quantity;
	public MyProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyProductDTO(String prodId, String prodName, int price, int quantity) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "MyProductDTO [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
