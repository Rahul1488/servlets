package com.te.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
Integer i = Integer.parseInt(req.getParameter("num 1"));
Integer j = Integer.parseInt(req.getParameter("num 2"));
	PrintWriter writer = resp.getWriter();
	writer.println("the sum of two numbers is ="+(i+j));
}
}
