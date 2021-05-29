package com.ego.pojo;



import java.io.Serializable;

public class UserInfo implements Serializable{

	private String account;//

	private Integer money;//

	private String name;//



	//get方法
	public String getAccount() {
		return account;
	}

	//set方法
	public void setAccount(String account) {
		this.account = account;
	}
	//get方法
	public Integer getMoney() {
		return money;
	}

	//set方法
	public void setMoney(Integer money) {
		this.money = money;
	}
	//get方法
	public String getName() {
		return name;
	}

	//set方法
	public void setName(String name) {
		this.name = name;
	}


}
