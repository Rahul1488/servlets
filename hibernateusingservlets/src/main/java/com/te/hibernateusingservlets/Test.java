package com.te.hibernateusingservlets;

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

@WebServlet("/Test")
public class Test extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parameter = request.getParameter("uname");
		String parameter2 = request.getParameter("pass");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Crud crud = new Crud();
		crud.setUname(parameter);
		crud.setPass(parameter2);
		createEntityManager.persist(crud);
		transaction.commit();
//		if (parameter.equals("vivek")) {
//			response.sendRedirect("http://localhost:8080/servlets2example");
//		}
	}
}
