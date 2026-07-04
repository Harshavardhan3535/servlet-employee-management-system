package com.ty.employee_management_system.controller;

import java.io.IOException;

import com.ty.employee_management_system.dao.EmployeeDao;
import com.ty.employee_management_system.entity.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateEmployeeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//read update form data
		String empid=req.getParameter("empId");
		String name=req.getParameter("empName");
		String email=req.getParameter("empEmail");
		String password=req.getParameter("empPassword");
		String age=req.getParameter("empAge");
		String gender=req.getParameter("empGender");
		String salary=req.getParameter("empSalary");
		String department=req.getParameter("empDept");
		
		System.out.println("Data Inserted successfully..");
		
		//Bind Data into object
		Employee emp=new Employee();
		emp.setEmpid(Integer.parseInt(empid));
		emp.setName(name);
		emp.setEmail(email);
		emp.setPassword(password);
		emp.setAge(Integer.parseInt(age));
		emp.setGender(gender);
		emp.setSalary(Double.parseDouble(salary));
		emp.setDepartment(department);
		
		
		EmployeeDao dao=new EmployeeDao();
		boolean b=dao.updateEmployee(emp);
		if(b) {
			System.out.println("Data is Updated successfully...");
			resp.sendRedirect("display");
		}else {
			System.out.println("Data is not Updated...");
		}
	}
}
