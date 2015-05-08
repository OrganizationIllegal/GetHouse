package com.kate.app.model;

public class InvestmentDate {
	private int id;
	private int year_increment_rate;
	private int middle_price;
	private int middle_zu_price;
	private int zu_house_rate;
	private String zu_xuqiu;
	private String price_review;
	private String data_exam;
	private int house_pro_id;
	public int getHouse_pro_id() {
		return house_pro_id;
	}
	public void setHouse_pro_id(int house_pro_id) {
		this.house_pro_id = house_pro_id;
	}
	public String getData_exam() {
		return data_exam;
	}
	public void setData_exam(String data_exam) {
		this.data_exam = data_exam;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear_increment_rate() {
		return year_increment_rate;
	}
	public void setYear_increment_rate(int year_increment_rate) {
		this.year_increment_rate = year_increment_rate;
	}
	public int getMiddle_price() {
		return middle_price;
	}
	public void setMiddle_price(int middle_price) {
		this.middle_price = middle_price;
	}
	public int getMiddle_zu_price() {
		return middle_zu_price;
	}
	public void setMiddle_zu_price(int middle_zu_price) {
		this.middle_zu_price = middle_zu_price;
	}
	public int getZu_house_rate() {
		return zu_house_rate;
	}
	public void setZu_house_rate(int zu_house_rate) {
		this.zu_house_rate = zu_house_rate;
	}
	public String getZu_xuqiu() {
		return zu_xuqiu;
	}
	public void setZu_xuqiu(String zu_xuqiu) {
		this.zu_xuqiu = zu_xuqiu;
	}
	public String getPrice_review() {
		return price_review;
	}
	public void setPrice_review(String price_review) {
		this.price_review = price_review;
	}
	
}
