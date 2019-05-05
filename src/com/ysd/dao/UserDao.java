package com.ysd.dao;

import java.util.List;

import com.ysd.entity.QueryVo;
import com.ysd.entity.User;

public interface UserDao {//持久层接口
	
	/**
	 * dao层  新增方法
	 * */
	public int add(User u);
	
	/**
	 * dao层  删除方法
	 * */
	public int delete(Integer id);
	
	/**
	 * dao层  删除方法
	 * */
	public int update(User u);
	
	/**
	 * dao层  查询方法
	 * */
	public List<User> select(QueryVo qv);
	/**
	 * dao层  查询条数方法
	 * */
	public int selectCount(QueryVo qv);
	
}
