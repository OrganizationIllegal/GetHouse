package com.kate.app.model;

public class BingMapVo {
	private int project_id;
	private String project_address;
	private String project_name;
	private int project_price;
	private int minArea;
	private int maxArea;
	private int keshou;
	private int average_price;
    private String house_type;
	public BingMapVo(int project_id,String project_address, String project_name,int project_price,int minArea,int maxArea,int keshou,int average_price,String house_type){
		this.project_id=project_id;
		this.project_address=project_address;
		this.project_name=project_name;
		this.project_price=project_price;
		this.minArea=minArea;
		this.maxArea=maxArea;
		this.keshou=keshou;
		this.average_price=average_price;
		this.house_type=house_type;
	}
	
	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_address() {
		return project_address;
	}
	public void setProject_address(String project_address) {
		this.project_address = project_address;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	
	public int getProject_price() {
		return project_price;
	}

	public void setProject_price(int project_price) {
		this.project_price = project_price;
	}

	public int getMinArea() {
		return minArea;
	}
	public void setMinArea(int minArea) {
		this.minArea = minArea;
	}
	public int getMaxArea() {
		return maxArea;
	}
	public void setMaxArea(int maxArea) {
		this.maxArea = maxArea;
	}
	public int getKeshou() {
		return keshou;
	}
	public void setKeshou(int keshou) {
		this.keshou = keshou;
	}
	public int getAverage_price() {
		return average_price;
	}
	public void setAverage_price(int average_price) {
		this.average_price = average_price;
	}
	public String getHouse_type() {
		return house_type;
	}
	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}
	

}
