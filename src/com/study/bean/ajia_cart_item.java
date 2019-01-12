package com.study.bean;


public class ajia_cart_item {
/*id
user_id
item_id
num
status
created
updated
*/
	
	private Integer id;
	private Integer userId;
	private Integer itemId;
	private int num;
	private int status;
	private String created;
	private String updated;
	
	public ajia_cart_item() {}
	
	public ajia_cart_item(Integer id, Integer userId, Integer itemId, int num, int status, String created,
			String updated) {
		super();
		this.id = id;
		this.userId = userId;
		this.itemId = itemId;
		this.num = num;
		this.status = status;
		this.created = created;
		this.updated = updated;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	
	
	
	
}
