package com.study.bean;

public class ajia_collect_item {

	private int id;
	private int user_id;
	private int item_id;
	private String title;
	private double price;
	private String pic_path;
	private String item_param_data;
	private int status;
	private String created;
	private String updated;
	public ajia_collect_item()
	{
		
	}
	public ajia_collect_item(int id, int user_id, int item_id, String title, double price, String pic_path,
			String item_param_data, int status, String created, String updated) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.item_id = item_id;
		this.title = title;
		this.price = price;
		this.pic_path = pic_path;
		this.item_param_data = item_param_data;
		this.status = status;
		this.created = created;
		this.updated = updated;
	}
	public int getId() {
		return id;
	}
	public int getUser_id() {
		return user_id;
	}
	public int getItem_id() {
		return item_id;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public String getPic_path() {
		return pic_path;
	}
	public String getItem_param_data() {
		return item_param_data;
	}
	public int getStatus() {
		return status;
	}
	public String getCreated() {
		return created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}
	public void setItem_param_data(String item_param_data) {
		this.item_param_data = item_param_data;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	
}
