//package com.te.hibernateusingservlets;
//
//import java.io.IOException;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class Login extends HttpServlet {
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String parameter = req.getParameter("uname");
//		String parameter2 = req.getParameter("pass");
//		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
//		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
//		Crud crud = new Crud();
//		crud.setUname(parameter);
//		crud.setPass(parameter2);
//		createEntityManager.persist(crud);
//		transaction.commit();
//	}
//}
