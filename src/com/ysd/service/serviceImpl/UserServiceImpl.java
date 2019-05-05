package com.ysd.service.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ysd.dao.UserDao;
import com.ysd.entity.QueryVo;
import com.ysd.entity.User;
import com.ysd.service.service.UserService;

@Service//创建bean对象
public class UserServiceImpl implements UserService {//业务层实现类

	@Resource//自动注入
	private UserDao dao;

	/**
	 * service实现类层  新增功能
	 * */
	@Override
	public int add(User u) {
		return dao.add(u);
	}
	
	/**
	 * service实现类层  删除功能
	 * */
	@Override
	public int delete(Integer id) {
		return dao.delete(id);
	}

	/**
	 * service实现类层  修改功能
	 * */
	@Override
	public int update(User u) {
		return dao.update(u);
	}
	
	/**
	 * service实现类层  查询功能
	 * */
	@Override
	public List<User> select(QueryVo qv) {
		return dao.select(qv);
	}

	@Override
	public int selectCount(QueryVo qv) {
		return dao.selectCount(qv);
	}

}
