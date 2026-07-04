package com.ty.employee_management_system.controller;

import java.io.IOException;

import com.ty.employee_management_system.dao.EmployeeDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteEmployeeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		
		EmployeeDao dao=new EmployeeDao();
		boolean b=dao.deleteEmployeeById(Integer.parseInt(id));
		if(b) {
			System.out.println("Data is Deleted");
			resp.sendRedirect("display");
		}else {
			System.out.println("Data is not Deleted...");
		}
	}
}
