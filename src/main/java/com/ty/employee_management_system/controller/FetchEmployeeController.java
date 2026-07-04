package com.ty.employee_management_system.controller;

import java.io.IOException;
import java.util.List;

import com.ty.employee_management_system.dao.EmployeeDao;
import com.ty.employee_management_system.entity.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class FetchEmployeeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//call getAllEmployee Method
		EmployeeDao dao=new EmployeeDao();
		List<Employee> emp=dao.getAllEmployee();
		
		req.setAttribute("employee", emp);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("display-emp.jsp");
		dispatcher.forward(req, resp); 
//		for (Employee employee : emp) {
//			System.out.println(employee.getName());
//			System.out.println(employee.getEmail());
//		}
	}
}
