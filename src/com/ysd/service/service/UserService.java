package com.ysd.service.service;

import java.util.List;

import com.ysd.entity.QueryVo;
import com.ysd.entity.User;

public interface UserService {//业务层接口
	/**
	 * service层  新增功能
	 * */
	public int add(User u);
	
	/**
	 * service层  删除功能
	 * */
	public int delete(Integer id);
	
	/**
	 * service层  删除功能
	 * */
	public int update(User u);
	
	/**
	 * service层  查询功能
	 * */
	public List<User> select(QueryVo qv);
	/**
	 * service层  查询条数功能
	 * */
	public int selectCount(QueryVo qv);

}
