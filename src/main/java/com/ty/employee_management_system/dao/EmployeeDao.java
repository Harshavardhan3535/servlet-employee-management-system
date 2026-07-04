package com.ty.employee_management_system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.employee_management_system.connection.GetConnection;
import com.ty.employee_management_system.entity.Employee;

public class EmployeeDao {
	//design a method to save record
	Connection con=GetConnection.getConnectionObject();
	public boolean registerEmployee(Employee emp) {
//		System.out.println(con);
		
		String insertQuery="insert into employee values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(insertQuery);
			
			pstm.setInt(1, emp.getEmpid());
			pstm.setString(2, emp.getName());
			pstm.setString(3, emp.getEmail());
			pstm.setString(4, emp.getPassword());
			pstm.setInt(5, emp.getAge());
			pstm.setString(6, emp.getGender());
			pstm.setDouble(7, emp.getSalary());
			pstm.setString(8, emp.getDepartment());
			
			int row=pstm.executeUpdate();
			return row>0;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;	
	}
	
	//design a method to fetch all employee record
	public List<Employee> getAllEmployee(){
		String selectQuery="select * from employee";
		List<Employee> listEmp=new ArrayList<Employee>();
		try {
			PreparedStatement pstm=con.prepareStatement(selectQuery);
			
			ResultSet res=pstm.executeQuery();
			
			while(res.next()) {
				int empid=res.getInt("empid");
				String name=res.getString("name");
				String email=res.getString("email");
				String password=res.getString("password");
				int age=res.getInt("age");
				String gender=res.getString("gender");
				Double salary=res.getDouble("salary");
				String dept=res.getString("dept");
				
				// bind the data into object
				Employee emp=new Employee();
				emp.setEmpid(empid);
				emp.setName(name);
				emp.setEmail(email);
				emp.setPassword(password);
				emp.setAge(age);
				emp.setGender(gender);
				emp.setSalary(salary);
				emp.setDepartment(dept);
				
				listEmp.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listEmp;
	}
	
	//design a method to delete employee 
	public boolean deleteEmployeeById(int empid) {
		String deleteQuery="delete from employee where empid=?";
		try {
			PreparedStatement pstm=con.prepareStatement(deleteQuery);
			pstm.setInt(1, empid);
			int row=pstm.executeUpdate();
			return row > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//design a method to fetch employee by empid
	public Employee getEmployeeByID(int id){
		String selectQuery="select * from employee where empid=?";
		try {
			PreparedStatement pstm=con.prepareStatement(selectQuery);
			pstm.setInt(1, id);
			ResultSet res=pstm.executeQuery();
			
			if(res.next()) {
				int empid=res.getInt("empid");
				String name=res.getString("name");
				String email=res.getString("email");
				String password=res.getString("password");
				int age=res.getInt("age");
				String gender=res.getString("gender");
				Double salary=res.getDouble("salary");
				String dept=res.getString("dept");
				
				// bind the data into object
				Employee emp=new Employee();
				emp.setEmpid(empid);
				emp.setName(name);
				emp.setEmail(email);
				emp.setPassword(password);
				emp.setAge(age);
				emp.setGender(gender);
				emp.setSalary(salary);
				emp.setDepartment(dept);
				
				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//update 
	
	public boolean updateEmployee(Employee emp) {
		String updateQuery="update employee set name=?, email=?, password=?, age=?,  gender=?, salary=?, dept=? where empid=?";
		try {
			PreparedStatement pstm=con.prepareStatement(updateQuery);
			
			pstm.setString(1, emp.getName());
			pstm.setString(2, emp.getEmail());
			pstm.setString(3, emp.getPassword());
			pstm.setInt(4, emp.getAge());
			pstm.setString(5, emp.getGender());
			pstm.setDouble(6, emp.getSalary());
			pstm.setString(7, emp.getDepartment());
			pstm.setInt(8, emp.getEmpid());
			
			int rows=pstm.executeUpdate();
			
			return rows >0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
