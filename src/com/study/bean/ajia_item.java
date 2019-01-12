package com.study.bean;

public class ajia_item {
	private Long id;
	private int cid;
	private String brand;
	private String model;
	private String title;
	private String sell_point;
	private int price;
	private int num;
	private String barcode;
	private String image;
	private int status;
	private String created;
	private String updated;
	
	public ajia_item() {
		super();
	}
	
	public ajia_item(long id, int cid, String brand, String model, String title, String sell_point, int price, int num,
			String barcode, String image, int status, String created, String updated) {
		super();
		this.id =  id;
		this.cid = cid;
		this.brand = brand;
		this.model = model;
		this.title = title;
		this.sell_point = sell_point;
		this.price = price;
		this.num = num;
		this.barcode = barcode;
		this.image = image;
		this.status = status;
		this.created = created;
		this.updated = updated;
	}

	public Long getId() {
		return id;
	}
	public int getCid() {
		return cid;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public String getTitle() {
		return title;
	}
	public String getSell_point() {
		return sell_point;
	}
	public int getPrice() {
		return price;
	}
	public int getNum() {
		return num;
	}
	public String getBarcode() {
		return barcode;
	}
	public String getImage() {
		return image;
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
	public void setId(long id) {
		this.id =  id;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public void setImage(String image) {
		this.image = image;
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
