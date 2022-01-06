package com.te.servletsexample2;

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


@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("ename");
		String parameter2 = request.getParameter("edes");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEname("ename");
		employeeDetails.setEdes("edes");
		createEntityManager.persist(employeeDetails);
		transaction.commit();
		
	}

}
