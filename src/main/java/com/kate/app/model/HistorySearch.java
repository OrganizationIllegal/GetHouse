package com.kate.app.model;

import java.sql.Timestamp;

public class HistorySearch {
	private int id;
	private String search_content;
	private Timestamp search_time;
	private int userid;
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSearch_content() {
		return search_content;
	}
	public void setSearch_content(String search_content) {
		this.search_content = search_content;
	}
	public Timestamp getSearch_time() {
		return search_time;
	}
	public void setSearch_time(Timestamp search_time) {
		this.search_time = search_time;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	

}
