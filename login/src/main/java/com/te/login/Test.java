package com.te.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	PrintWriter writer = res.getWriter();
	String parameter = req.getParameter("uname");
	String parameter2 = req.getParameter("upass");
	writer.println("Hello "+parameter);
	writer.println("Your password is "+parameter2);
String[] parameterValues = req.getParameterValues("Store");
	for (int i = 0; i < parameterValues.length; i++) {
		writer.println(parameterValues[i]);
	}
		
	}

}
