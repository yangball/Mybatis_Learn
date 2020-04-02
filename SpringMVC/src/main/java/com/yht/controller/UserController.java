package com.yht.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yht.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {

	/**
	 * 返回字符串
	 * 
	 * @return
	 */
	@RequestMapping("/testString")
	public String testString(Model model) {
		System.out.println("执行了testString方法。。。");
		// 模拟从数据库中查询处User对象
		User user = new User();
		user.setUsername("阿达");
		user.setPassword("123");
		user.setAge(23);
		// model对象
		model.addAttribute("user", user);
		return "success";
	}

	/**
	 * 返回void有三种方法
	 * 1.请求转发  2.重定向(不能访问WEB-INF中的文件)  3.使用流直接访问
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/testVoid")
	public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("执行了testVoid方法。。。");
		// 编写请求转发的程序
		// request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,
		// response);

		// 重定向
		// response.sendRedirect(request.getContextPath()+"/index.jsp");

		// 设置中文乱码
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		// 直接会进行响应
		response.getWriter().print("你好");

		return;
	}

	/**
	 * modelandview的使用
	 * @return
	 */
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView() {
		System.out.println("执行了ModelAndView。。。");
		// 模拟从数据库中查询处User对象
		User user = new User();
		user.setUsername("阿达");
		user.setPassword("123");
		user.setAge(23);

		// 创建ModelAndView对象
		ModelAndView mv = new ModelAndView();
		//把user对象存储到mv对象中，也会把user对象存入到request对象
		mv.addObject("user", user);
		//跳转到哪个页面
		mv.setViewName("success");
		return mv;
	}
	
	/**
	 * 使用关键字的方式进行转发或者重定向
	 * @return
	 */
	@RequestMapping("/testForwardOrRedirect")
	public String testForwardOrRedirect() {
		System.out.println("执行了testForwardOrRedirect。。。");
		
		//请求的转发
		//return "forward:/WEB-INF/pages/success.jsp";
		
		//重定向
		return "redirect:/index.jsp";
	}
	
	/**
	 * 模拟异步请求响应
	 */
	@RequestMapping("/testAjax")
	public @ResponseBody User testAjax(@RequestBody User user) {
		System.out.println("执行了testAjax。。。");
		//客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中。
		System.out.println(user);
		//做响应,模拟查询数据库
		user.setUsername("haha");
		user.setAge(40);
		//作响应
		return user;
	}
	
	
	

}
