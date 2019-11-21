package com.tedu.req;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class doollistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//模拟JDBC访问数据查询所有门店信息
		List<String> doorList = new ArrayList();
		doorList.add("1,一号门店,123654");
		doorList.add("2,二号门店,163654");
		doorList.add("3,三号门店,153654");
		doorList.add("4,四号门店,143654");
		
		//2,将门店信息存入requet域中
		request.setAttribute("list", doorList);
		
		//通过转发将请求以及域对象中的数据转向jsp
		request.getRequestDispatcher("doorList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
