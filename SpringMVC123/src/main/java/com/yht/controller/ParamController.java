package com.yht.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yht.domain.Account;
import com.yht.domain.User;


@Controller
@RequestMapping("/param")
public class ParamController {
	
	
	/**
	 * 请求参数绑定把数据封装到JavaBean的类中
	 * @return
	 */
	@RequestMapping("/saveAccount")
	public String saveAccount(Account account) {
		System.out.println("执行了数据封装。。。");
		System.out.println(account);
		return "success";
	}
	
	
	/**
	 * 自定义类型转换器
	 * @param user
	 * @return
	 */
	@RequestMapping("/saveUser")
	public String saveUser(User user) {
		System.out.println("执行了自定义转换器。。。");
		System.out.println(user);
		return "success";
	}
	
	/**
	 * 原生ServletAPI
	 * @return
	 */
	@RequestMapping("/testServlet")
	public String testServlet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("执行了原生ServletAPI。。。");
		System.out.println(request);
		
		HttpSession session = request.getSession();
		System.out.println(session);
		
		ServletContext servletcontext = session.getServletContext();
		System.out.println(servletcontext);
		
		System.out.println(response);
		return "success";
	}
	
	
	
	
}
