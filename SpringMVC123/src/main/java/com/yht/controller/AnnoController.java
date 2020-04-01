package com.yht.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import com.yht.domain.User;

/**
 * 常见的注解
 * @author 22134
 *
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {
	
	
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(name = "name") String username) {
		System.out.println("执行了RequestParam注解。。。。");
		System.out.println(username);
		return "success";
	}
	
	/**
	 * 获取到请求体的内容
	 * @param body
	 * @return
	 */
	@RequestMapping("/testRequestBody")
	public String testRequestBody(@RequestBody String body) {
		System.out.println("执行了RequestBody注解。。。。");
		System.out.println(body);
		return "success";
	}
	
	/**
	 * PathVariable注解
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{sid}")
	public String testPathVariable(@PathVariable(name="sid") String id) {
		System.out.println("执行了PathVariable注解。。。。");
		System.out.println(id);
		return "success";
	}
	
	/**
	 * 获取请求头的值
	 * @param header
	 * @return
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept") String header) {
		System.out.println("执行了RequestHeader注解。。。");
		System.out.println(header);
		return "success";
	}
	
	/**
	 * 获取Cookie的值
	 * @param cookievalue
	 * @return
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue(value="JSESSIONID") String cookievalue) {
		System.out.println("执行了CookieValue注解。。。");
		System.out.println(cookievalue);
		return "success";
	}
	
	/**
	 * 获取Cookie的值
	 * @return
	 */
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(@ModelAttribute("abc") User user) {
		System.out.println("执行了ModelAttribute注解。。。");
		System.out.println(user);
		return "success";
	}
	
	@ModelAttribute
	public void showUser(String uname,Map<String,User> map) {
		System.out.println("showUser执行了。。。");
		//通过用户查询数据库(模拟)
		User user = new User();
		user.setUname(uname);
		user.setAge(20);
		user.setDate(new Date());
		map.put("abc", user);
	}
	
	/**
	 * 该方法会先执行
	 */
//	@ModelAttribute
//	public User showUser(String uname) {
//		System.out.println("showUser执行了。。。");
//		//通过用户查询数据库(模拟)
//		User user = new User();
//		user.setUname(uname);
//		user.setAge(20);
//		user.setDate(new Date());
//		return user;
//	}
	
	/**
	 * SessionAttributes的注解
	 * @param request
	 * @return
	 */
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Model model) {
		System.out.println("testSessionAttributes注解。。。");
		//底层会存储到request域对象中
		model.addAttribute("msg", "美美");
		return "success";
	}
	
	/**
	 * 获取值
	 * @param modelmap
	 * @return
	 */
	@RequestMapping("/getSessionAttributes")
	public String getSessionAttributes(ModelMap modelmap) {
		System.out.println("getSessionAttributes注解。。。");
		String msg = (String) modelmap.get("msg");
		System.out.println(msg);
		return "success";
	}
	
	/**
	 * 清除
	 * @param status
	 * @return
	 */
	@RequestMapping("/delSessionAttributes")
	public String delSessionAttributes(SessionStatus status) {
		System.out.println("delSessionAttributes注解。。。");
		status.setComplete();
		return "success";
	}
	
}
