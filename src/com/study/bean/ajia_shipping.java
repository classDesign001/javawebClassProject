package com.study.bean;

public class ajia_shipping {

	Integer id;
	boolean is_default;
	int status;
	Integer user_id;
	String receiver_name;

	String receiver_phone;
	String receiver_mobile;
	String receiver_state;
	String receiver_city;
	String receiver_district;
	String receiver_address;
	String receiver_zip;
	String cereated;
	String updated;
	
	
	
	public ajia_shipping(Integer id, boolean is_default, int status, Integer user_id, String receiver_name,
			String receiver_phone, String receiver_mobile, String receiver_state, String receiver_city,
			String receiver_district, String receiver_address, String receiver_zip, String cereated, String updated) {
		super();
		this.id = id;
		this.is_default = is_default;
		this.status = status;
		this.user_id = user_id;
		this.receiver_name = receiver_name;
		this.receiver_phone = receiver_phone;
		this.receiver_mobile = receiver_mobile;
		this.receiver_state = receiver_state;
		this.receiver_city = receiver_city;
		this.receiver_district = receiver_district;
		this.receiver_address = receiver_address;
		this.receiver_zip = receiver_zip;
		this.cereated = cereated;
		this.updated = updated;
	}

	
	



	public ajia_shipping() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isIs_default() {
		return is_default;
	}

	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getReceiver_phone() {
		return receiver_phone;
	}

	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}

	public String getReceiver_mobile() {
		return receiver_mobile;
	}

	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}

	public String getReceiver_state() {
		return receiver_state;
	}

	public void setReceiver_state(String receiver_state) {
		this.receiver_state = receiver_state;
	}

	public String getReceiver_city() {
		return receiver_city;
	}

	public void setReceiver_city(String receiver_city) {
		this.receiver_city = receiver_city;
	}

	public String getReceiver_district() {
		return receiver_district;
	}

	public void setReceiver_district(String receiver_district) {
		this.receiver_district = receiver_district;
	}

	public String getReceiver_address() {
		return receiver_address;
	}

	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}

	public String getReceiver_zip() {
		return receiver_zip;
	}

	public void setReceiver_zip(String receiver_zip) {
		this.receiver_zip = receiver_zip;
	}

	public String getCereated() {
		return cereated;
	}

	public void setCereated(String cereated) {
		this.cereated = cereated;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "ajia_shipping [id=" + id + ", is_default=" + is_default + ", status=" + status + ", user_id=" + user_id
				+ ", receiver_name=" + receiver_name + ", receiver_phone=" + receiver_phone + ", receiver_mobile="
				+ receiver_mobile + ", receiver_state=" + receiver_state + ", receiver_city=" + receiver_city
				+ ", receiver_district=" + receiver_district + ", receiver_address=" + receiver_address
				+ ", receiver_zip=" + receiver_zip + ", cereated=" + cereated + ", updated=" + updated + "]";
	}

	
	
	
}
