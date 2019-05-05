package com.ysd.entity;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

public class User {//用户表实体类
	
	private Integer id;//编号

    private String name;//姓名

    private String sex;//性别
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//接收页面String
    private Date birthday;//生日

    private String address;//地址

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//向页面响应String
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday="
				+ birthday + ", sex=" + sex + ", address=" + address + "]";
	}
    
    
    

}
