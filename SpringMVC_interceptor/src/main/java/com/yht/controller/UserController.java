package com.yht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("testInterceptor")
	public String testInterceptor() {
		System.out.println("执行了testInterceptor。。。");
		
		return "success";
	}
}
