package com.ysd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.entity.QueryVo;
import com.ysd.entity.User;
import com.ysd.service.service.UserService;

@RestController//扫描控制层，且所有方法都响应JSON
public class UserController {
	@Resource//自动注入
	private UserService userService;
	
	/**新增
	 * http://localhost:8080/EasyUI_SSM_MySQL/add.action
	 */
	@RequestMapping("/add")
	public Object add(User u){	
		System.out.println("接收到的要新增的数据："+u);
		if(userService.add(u)==0){
			return false;
		}
		return true;
	}
	
	/**删除
	 * http://localhost:8080/EasyUI_SSM_MySQL/delete.action
	 */
	@RequestMapping("/delete")
	public Object delete(Integer id){	
		System.out.println("接收到的要删除的id："+id);
		if(userService.delete(id)==0){
			return false;
		}
		return true;	
	}
	
	/**修改
	 * http://localhost:8080/EasyUI_SSM_MySQL/update.action
	 */
	@RequestMapping("/update")
	public Object update(User u){	
		System.out.println("接收到的要修改的数据："+u);
		if(userService.update(u)==0){
			return false;
		}
		return true;	
	}
	
	/**查询所有
	 * http://localhost:8080/EasyUI_SSM_MySQL/select.action
	 */
	@RequestMapping("/select")
	public Object select(QueryVo qv){	
		System.out.println("接收到的查询条件："+qv);
		
		//计算分页sql语句的偏移量
		Integer page = qv.getPage();
		Integer rows = qv.getRows();
		if(page!=null && page!=0){
			qv.setPage((page-1)*rows);
		}
		
		List<User> list = userService.select(qv);
		int total = userService.selectCount(qv);
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("total", total);
		map.put("rows", list);
		return map;		
	}
	

}
