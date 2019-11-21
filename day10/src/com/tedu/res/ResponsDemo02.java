package com.tedu.res;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponsDemo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		/*1,同一个web应用内的资源进行重定向
		从day10/com.tedu.res/ResponsDemo02访问day10/index2.jsp
		response.sendRedirect("index2.jsp");
		2,不同web应用内的资源进行重定向
		从day10/ResponsDemo02访问day09/form.html
		response.sendRedirect("/day09/form.html");*/
		//3、不同的虚拟主机内的资源进行重定向
		response.sendRedirect("http://tmooc.cn");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
