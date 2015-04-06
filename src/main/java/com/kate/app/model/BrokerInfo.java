package com.kate.app.model;

public class BrokerInfo {
	private int id;
	private String broker_name;
	private String broker_language;
	private String broker_region;
	private String broker_img;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBroker_name() {
		return broker_name;
	}
	public void setBroker_name(String broker_name) {
		this.broker_name = broker_name;
	}
	public String getBroker_language() {
		return broker_language;
	}
	public void setBroker_language(String broker_language) {
		this.broker_language = broker_language;
	}
	public String getBroker_region() {
		return broker_region;
	}
	public void setBroker_region(String broker_region) {
		this.broker_region = broker_region;
	}
	public String getBroker_img() {
		return broker_img;
	}
	public void setBroker_img(String broker_img) {
		this.broker_img = broker_img;
	}
}
