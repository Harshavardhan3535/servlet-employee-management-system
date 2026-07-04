<%@page import="com.ty.employee_management_system.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view-employee</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%-- <h1 display="flex" textalign="center" margin="auto" align="center">Database</h1>
	<%
		List<Employee> emp = (List<Employee>)request.getAttribute("employee");
	%>
	<table border="2" height="100" width="450" cellpadding="25" style="border-collapse: collapse;" borderColor="Black" align="center">
		<tr>
			<th>EmpId</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Salary</th>
			<th>Department</th>
			<th colspan="2">Action</th>
		</tr>
		    <%for(Employee employee:emp){ %>
		<tr>
			<td><%=employee.getEmpid() %></td>
			<td><%=employee.getName() %></td>
			<td><%=employee.getEmail() %></td>
			<td><%=employee.getPassword() %></td>
			<td><%=employee.getAge() %></td>
			<td><%=employee.getGender() %></td>
			<td><%=employee.getSalary() %></td>
			<td><%=employee.getDepartment() %></td>
			<td><a href="update-emp.jsp?id=<%=employee.getEmpid() %>"><button>Update</button></a></td>
			<td><a href="delete?id=<%=employee.getEmpid() %>"><button>Delete</button></a></td>
			<%} %>
		</tr>
	</table>
	
	<a href="home.jsp" border="2px" display="block" margin-left="50wh" align="center"><button align="center" margin="100px">Back</button></a> --%>
	
	
	<div class="container-wide">
        <div class="header-actions">
            <h1 class="heading-secondary">📋 Employee Records</h1>
            <a href="home.jsp" class="btn btn-back">← Back to Home</a>
        </div>
        
        <div class="table-wrapper">
            <%
                List<Employee> emp = (List<Employee>) request.getAttribute("employee");
                if (emp != null && !emp.isEmpty()) {
            %>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Password</th>
                        <th>Age</th>
                        <th>Gender</th>
                        <th>Salary</th>
                        <th>Department</th>
                        <th colspan="2">Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Employee employee : emp) { %>
                    <tr>
                        <td><strong><%= employee.getEmpid() %></strong></td>
                        <td><%= employee.getName() %></td>
                        <td><%= employee.getEmail() %></td>
                        <td>••••••</td>
                        <td><%= employee.getAge() %></td>
                        <td><%= employee.getGender() %></td>
                        <td>$<%= String.format("%,.2f", employee.getSalary()) %></td>
                        <td><span class="department-badge"><%= employee.getDepartment() %></span></td>
                        <td>
                            <a href="update-emp.jsp?id=<%= employee.getEmpid() %>" class="btn btn-success btn-sm">✏️ Update</a>
                        </td>
                        <td>
                            <a href="delete?id=<%= employee.getEmpid() %>" 
                               onclick="return confirm('Are you sure you want to delete this employee?')" 
                               class="btn btn-danger btn-sm">🗑️ Delete</a>
                        </td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
            <%
                } else {
            %>
            <div class="empty-state">
                <span class="icon">📭</span>
                <h3>No Employees Found</h3>
                <p style="color: #999; margin-top: 10px;">Click on Register button to add new employees.</p>
                <a href="register.html" class="btn btn-primary" style="margin-top: 20px;">➕ Register New Employee</a>
            </div>
            <%
                }
            %>
        </div>
    </div>
</body>
</html>