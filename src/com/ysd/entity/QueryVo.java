package com.ysd.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class QueryVo {//用来接收查询条件，方便springmvc封装
	
	private User u=new User();
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//接收页面String
	private Date birthday2;//结束日期，开始日期使用u接收了
	private Integer page;//接收easyui传来的页码
	private Integer rows;//接收easyui传来的每页显示的条数
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//向页面响应String
	public Date getBirthday2() {
		return birthday2;
	}
	public void setBirthday2(Date birthday2) {
		this.birthday2 = birthday2;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	public QueryVo() {
		super();
	}
	public QueryVo(User u, Date birthday2, Integer page, Integer rows) {
		super();
		this.u = u;
		this.birthday2 = birthday2;
		this.page = page;
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "QueryVo [u=" + u + ", birthday2=" + birthday2 + ", page="
				+ page + ", rows=" + rows + "]";
	}
	
}
