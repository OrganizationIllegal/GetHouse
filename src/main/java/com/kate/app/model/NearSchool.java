package com.kate.app.model;

public class NearSchool {
	private int id;
	private String school_name;
	private int school_distance; 
	private int house_pro_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public int getSchool_distance() {
		return school_distance;
	}
	public void setSchool_distance(int school_distance) {
		this.school_distance = school_distance;
	}
	public int getHouse_pro_id() {
		return house_pro_id;
	}
	public void setHouse_pro_id(int house_pro_id) {
		this.house_pro_id = house_pro_id;
	}
	
}
