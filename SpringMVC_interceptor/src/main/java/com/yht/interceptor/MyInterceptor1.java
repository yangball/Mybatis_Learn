package com.yht.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor1 implements HandlerInterceptor{
	/**
	 * 预处理，controller方法执行前
	 * return true；放行，执行下一个拦截器，如果没有，执行controller中的方法
	 * retrun false；不放行
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("MyInterceptor1执行了。。。。");
//		request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request, response);
		return true;
	}

	
	/**
	 * 后处理方法，controller方法执行后，success.jsp执行之前
	 * 可以进行页面跳转
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("MyInterceptor1执行了。。。后");
//		request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request, response);
	}

	/**
	 * success.jsp页面执行后，该方法会执行
	 * 不能进行页面跳转
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor1执行了。。。最后");	
	}
}
