<%@page import="com.ty.employee_management_system.entity.Employee"%>
<%@page import="com.ty.employee_management_system.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update-form</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%-- <%
		String id=request.getParameter("id");
		EmployeeDao dao=new EmployeeDao();
		
		Employee emp=dao.getEmployeeByID(Integer.parseInt(id));
	%>
	<form action="update">
		EmpId:<input type="text" name="empId" value="<%=emp.getEmpid()%>" readonly/><br><br>		
		Name:<input type="text" name="empName" value="<%=emp.getName()%>"/><br><br>
		Email:<input type="email" name="empEmail" value="<%=emp.getEmail()%>"/><br><br>
		Password:<input type="password" name="empPassword" value="<%=emp.getPassword()%>"/><br><br>
		Age:<input type="number" name="empAge" value="<%=emp.getAge()%>"/><br><br>
		Male:<input type="radio" name="empGender" value="male" /><br><br>
		Female:<input type="radio" name="empGender" value="female"/><br><br>
		Salary:<input type="text" name="empSalary" value="<%=emp.getSalary()%>"/><br><br>
		Department:<input type="text" name="empDept" value="<%=emp.getDepartment()%>"/><br><br>
		
		<input type="submit" value="update"/>
		
	</form> --%>
	
	
	
	<div class="container">
        <h2 class="heading-primary">✏️ Update Employee</h2>
        
        <%
            String id = request.getParameter("id");
            EmployeeDao dao = new EmployeeDao();
            Employee emp = dao.getEmployeeByID(Integer.parseInt(id));
        %>
        
        <form action="update">
            <div class="form-group">
                <label>Employee ID <span class="employee-id-badge">Read Only</span></label>
                <input type="text" name="empId" value="<%= emp.getEmpid() %>" readonly />
            </div>
            
            <div class="form-group">
                <label>Full Name</label>
                <input type="text" name="empName" value="<%= emp.getName() %>" required />
            </div>
            
            <div class="form-group">
                <label>Email Address</label>
                <input type="email" name="empEmail" value="<%= emp.getEmail() %>" required />
            </div>
            
            <div class="form-group">
                <label>Password</label>
                <input type="password" name="empPassword" value="<%= emp.getPassword() %>" required />
            </div>
            
            <div class="form-group">
                <label>Age</label>
                <input type="number" name="empAge" value="<%= emp.getAge() %>" required />
            </div>
            
            <div class="form-group">
                <label>Gender</label>
                <div class="radio-group">
                    <label>
                        <input type="radio" name="empGender" value="male" 
                               <%= "male".equals(emp.getGender()) ? "checked" : "" %> /> Male
                    </label>
                    <label>
                        <input type="radio" name="empGender" value="female" 
                               <%= "female".equals(emp.getGender()) ? "checked" : "" %> /> Female
                    </label>
                </div>
            </div>
            
            <div class="form-group">
                <label>Salary</label>
                <input type="text" name="empSalary" value="<%= emp.getSalary() %>" required />
            </div>
            
            <div class="form-group">
                <label>Department</label>
                <input type="text" name="empDept" value="<%= emp.getDepartment() %>" required />
            </div>
            
            <div class="btn-group">
                <button type="submit" class="btn btn-success">💾 Update Employee</button>
                <a href="display" class="btn btn-back" style="text-align: center;">❌ Cancel</a>
            </div>
        </form>
    </div>
</body>
</html>