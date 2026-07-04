<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display info</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<!-- <h1 align="center">Welcome to employee management system</h1>
	<a href="register.html"><button>Register</button></a>
	<a href="display"><button>Display-Page</button></a> -->
	
	<div class="dashboard">
        <span class="logo-icon">👔</span>
        <h1 class="heading-primary">Employee Management</h1>
        <p class="subtitle">Efficiently manage your workforce</p>
        
        <div class="button-group">
            <a href="register.html" class="btn btn-primary">➕ Register</a>
            <a href="display" class="btn btn-secondary">📋 View All</a>
        </div>
        
        <div class="stats">
            <div class="stat-item">
                <div class="stat-number">✓</div>
                <div class="stat-label">Easy Registration</div>
            </div>
            <div class="stat-item">
                <div class="stat-number">🔄</div>
                <div class="stat-label">Update Records</div>
            </div>
            <div class="stat-item">
                <div class="stat-number">🗑️</div>
                <div class="stat-label">Delete Entries</div>
            </div>
        </div>
    </div>
</body>
</html>