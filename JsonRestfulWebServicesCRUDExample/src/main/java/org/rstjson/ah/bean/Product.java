package org.rstjson.ah.bean;

public class Product{
	
	int ID;
	String NAME;	
	float PRICE;
	
	public Product() {
		super();
	}
	public Product(int i, String productName,float price) {
		super();
		this.ID = i;
		this.NAME = productName;
		this.PRICE=price;
	}
	public int getId() {
		return ID;
	}
	public void setId(int id) {
		this.ID = id;
	}
	public String getProductName() {
		return NAME;
	}
	public void setProductName(String productName) {
		this.NAME = productName;
	}
	public float getPrice() {
		return PRICE;
	}
	public void setPrice(float price) {
		this.PRICE = price;
	}	
	
}