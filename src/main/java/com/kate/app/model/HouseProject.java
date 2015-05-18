package com.kate.app.model;

import java.sql.Timestamp;

public class HouseProject {
	private int id;
	private String project_name;
	private String project_img;
	private String project_nation;
	private String project_address;
	private String project_area;    
	private int project_price_qi;
	private String project_type;
	private int project_sales_remain;
	private Timestamp project_finish_time;
	private String project_desc;
	private int developer_id;
	private int area_id;
	private String mianji;
	private int recommend_id_1;
	private int recommend_id_2;
	private int recommend_id_3;
	private String wuyefei;
	public String getMianji() {
		return mianji;
	}
	public String getWuyefei() {
		return wuyefei;
	}
	public void setWuyefei(String wuyefei) {
		this.wuyefei = wuyefei;
	}
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	public int getRecommend_id_1() {
		return recommend_id_1;
	}
	public void setRecommend_id_1(int recommend_id_1) {
		this.recommend_id_1 = recommend_id_1;
	}
	public int getRecommend_id_2() {
		return recommend_id_2;
	}
	public void setRecommend_id_2(int recommend_id_2) {
		this.recommend_id_2 = recommend_id_2;
	}
	public int getRecommend_id_3() {
		return recommend_id_3;
	}
	public void setRecommend_id_3(int recommend_id_3) {
		this.recommend_id_3 = recommend_id_3;
	}
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	public BrokerInfo getBrokerInfo() {
		return brokerInfo;
	}
	public void setBrokerInfo(BrokerInfo brokerInfo) {
		this.brokerInfo = brokerInfo;
	}

	private BrokerInfo brokerInfo;
	private String project_city;
	private String project_house_type;
	private int project_high;
	private String project_price;
	private String project_lan_en;
	private String project_lan_cn;
	private String project_num;
	private String project_vedio;
	private String project_zhou;
	private String area_qujian;
	private String gps;
	private String return_money;
	private String project_peitao_img;
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
	public String getProject_address() {
		return project_address;
	}
	public void setProject_address(String project_address) {
		this.project_address = project_address;
	}
	public String getProject_area() {
		return project_area;
	}
	public void setProject_area(String project_area) {
		this.project_area = project_area;
	}
	public int getProject_price_qi() {
		return project_price_qi;
	}
	public void setProject_price_qi(int project_price_qi) {
		this.project_price_qi = project_price_qi;
	}
	public String getProject_type() {
		return project_type;
	}
	public void setProject_type(String project_type) {
		this.project_type = project_type;
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
	public String getProject_city() {
		return project_city;
	}
	public void setProject_city(String project_city) {
		this.project_city = project_city;
	}
	public String getProject_house_type() {
		return project_house_type;
	}
	public void setProject_house_type(String project_house_type) {
		this.project_house_type = project_house_type;
	}
	public int getProject_high() {
		return project_high;
	}
	public void setProject_high(int project_high) {
		this.project_high = project_high;
	}
	public String getProject_price() {
		return project_price;
	}
	public void setProject_price(String project_price) {
		this.project_price = project_price;
	}
	public String getProject_lan_en() {
		return project_lan_en;

	}
	


	public void setProject_lan_en(String project_lan_en) {
		this.project_lan_en = project_lan_en;
	}
	public String getProject_lan_cn() {
		return project_lan_cn;
	}
	public void setProject_lan_cn(String project_lan_cn) {
		this.project_lan_cn = project_lan_cn;
	}
	public String getProject_num() {
		return project_num;
	}
	public void setProject_num(String project_num) {
		this.project_num = project_num;
	}
	public String getProject_vedio() {
		return project_vedio;
	}
	public void setProject_vedio(String project_vedio) {
		this.project_vedio = project_vedio;
	}
	public String getProject_zhou() {
		return project_zhou;
	}
	public void setProject_zhou(String project_zhou) {
		this.project_zhou = project_zhou;
	}
	public String getArea_qujian() {
		return area_qujian;
	}
	public void setArea_qujian(String area_qujian) {
		this.area_qujian = area_qujian;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	public String getReturn_money() {
		return return_money;
	}

	public void setReturn_money(String return_money) {
		this.return_money = return_money;
	}
	public String getProject_peitao_img() {
		return project_peitao_img;
	}
	public void setProject_peitao_img(String project_peitao_img) {
		this.project_peitao_img = project_peitao_img;
	}
	
}
