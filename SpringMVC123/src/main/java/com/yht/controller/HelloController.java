package com.yht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yht.domain.Account;

@Controller
@RequestMapping(path="/user")
public class HelloController {
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(path="/hello")
	public String sayHello() {
		System.out.println("执行成功！");
		return "success";
	}
	
	/**
	 * RequestMapping注解测试
	 * @return
	 */
	@RequestMapping(path="/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("测试RequestMapping注解。。。");
		return "success";
	}
	
	/**
	 * 请求参数的绑定
	 * @return
	 */
	@RequestMapping("/testParam")
	public String testParam(String username,String password) {
		System.out.println("执行了testParam...");
		System.out.println("用户名："+username);
		System.out.println("密码："+password);
		return "success";
	}
	
}
