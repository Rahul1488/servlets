package com.te.servlets2example;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlets")
public class EmployeeServlets extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parameter = request.getParameter("ename");
		String parameter2 = request.getParameter("edes");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Employee employee = new Employee();
		employee.setEname(parameter);
		employee.setEdes(parameter2);
		createEntityManager.persist(employee);
		transaction.commit();
		String parameter3 = request.getParameter("name");
		String parameter4 = request.getParameter("pass");

	}
}
