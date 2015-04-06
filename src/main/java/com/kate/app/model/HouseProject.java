package com.kate.app.model;

import java.sql.Timestamp;

public class HouseProject {
	private int id;
	private String project_name;
	private String project_img;
	private String project_nation;
	private String project_detail_add;
	private int project_area;
	private int project_price_avg;
	private String project_style;
	private int project_sales_remain;
	private Timestamp project_finish_time;
	private String project_desc;
	private int developer_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_img() {
		return project_img;
	}
	public void setProject_img(String project_img) {
		this.project_img = project_img;
	}
	public String getProject_nation() {
		return project_nation;
	}
	public void setProject_nation(String project_nation) {
		this.project_nation = project_nation;
	}
	public String getProject_detail_add() {
		return project_detail_add;
	}
	public void setProject_detail_add(String project_detail_add) {
		this.project_detail_add = project_detail_add;
	}
	public int getProject_area() {
		return project_area;
	}
	public void setProject_area(int project_area) {
		this.project_area = project_area;
	}
	public int getProject_price_avg() {
		return project_price_avg;
	}
	public void setProject_price_avg(int project_price_avg) {
		this.project_price_avg = project_price_avg;
	}
	public String getProject_style() {
		return project_style;
	}
	public void setProject_style(String project_style) {
		this.project_style = project_style;
	}
	public int getProject_sales_remain() {
		return project_sales_remain;
	}
	public void setProject_sales_remain(int project_sales_remain) {
		this.project_sales_remain = project_sales_remain;
	}
	public Timestamp getProject_finish_time() {
		return project_finish_time;
	}
	public void setProject_finish_time(Timestamp project_finish_time) {
		this.project_finish_time = project_finish_time;
	}
	public String getProject_desc() {
		return project_desc;
	}
	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}
	public int getDeveloper_id() {
		return developer_id;
	}
	public void setDeveloper_id(int developer_id) {
		this.developer_id = developer_id;
	}
	
	
	
	
}
