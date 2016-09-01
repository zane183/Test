package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import com.netease.Kitchen;

public class NoodlesServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		String vegetable = request.getParameter("vegetable");

		// 使用Log4j，记录日志
		// 创建日志对象
		Logger log = Logger.getLogger(NoodlesServlet.class);
		// 记录日志
		log.info("这次加入的蔬菜是：" + vegetable);

		String noodles = Kitchen.makeNoodles(vegetable);
		writer.println(noodles);
	}
}
