package com.ego.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class ItemInfo implements Serializable{
	@TableId(type = IdType.AUTO)
	private Integer id;//

	private String name;//商品名称

	private Integer count;//商品数量

	private Integer price;//商品价格



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public String getName() {
		return name;
	}

	//set方法
	public void setName(String name) {
		this.name = name;
	}
	//get方法
	public Integer getCount() {
		return count;
	}

	//set方法
	public void setCount(Integer count) {
		this.count = count;
	}
	//get方法
	public Integer getPrice() {
		return price;
	}

	//set方法
	public void setPrice(Integer price) {
		this.price = price;
	}


}
