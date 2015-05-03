package com.kate.app.model;

public class HouseTaxVo {
	private String type;
	private int price;
	private String description;
    public HouseTaxVo(String type,int price,String description){
    	this.type=type;
    	this.price=price;
    	this.description=description;
    }
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
}
