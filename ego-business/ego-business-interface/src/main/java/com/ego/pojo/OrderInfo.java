package com.ego.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class OrderInfo implements Serializable{

	@TableId(type = IdType.AUTO)
	private Integer id;//主键

	private String message;//留言

	private Integer money;//总金额



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public String getMessage() {
		return message;
	}

	//set方法
	public void setMessage(String message) {
		this.message = message;
	}
	//get方法
	public Integer getMoney() {
		return money;
	}

	//set方法
	public void setMoney(Integer money) {
		this.money = money;
	}


}
