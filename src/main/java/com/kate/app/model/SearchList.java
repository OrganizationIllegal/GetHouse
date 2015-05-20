package com.kate.app.model;

public class SearchList {
	private int id;
	private String project_img;
	private String project_name;
	private int maxPrice;
	private int minPrice;
	private int maxArea;
	private int minArea;
	private int keshou;
	private int fanxian;
	private String project_num;
	public String getProject_num() {
		return project_num;
	}
	public void setProject_num(String project_num) {
		this.project_num = project_num;
	}
	public SearchList(int id,String project_num, String project_img,String project_name,int maxPrice,int minPrice ,int maxArea,int minArea,int keshou,int fanxian ){
		this.id=id;
		this.project_num = project_num;
		this.project_img=project_img;
		this.project_name=project_name;
		this.maxPrice=maxPrice;
		this.minPrice=minPrice;
		this.maxArea=maxArea;
		this.minArea=minArea;
		this.keshou=keshou;
		this.fanxian=fanxian;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public int getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public int getMaxArea() {
		return maxArea;
	}
	public void setMaxArea(int maxArea) {
		this.maxArea = maxArea;
	}
	public int getMinArea() {
		return minArea;
	}
	public void setMinArea(int minArea) {
		this.minArea = minArea;
	}
	public int getKeshou() {
		return keshou;
	}
	public void setKeshou(int keshou) {
		this.keshou = keshou;
	}
	public int getFanxian() {
		return fanxian;
	}
	public void setFanxian(int fanxian) {
		this.fanxian = fanxian;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject_img() {
		return project_img;
	}
	public void setProject_img(String project_img) {
		this.project_img = project_img;
	}
	
	

}
