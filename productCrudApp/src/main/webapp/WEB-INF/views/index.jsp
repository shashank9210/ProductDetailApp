<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file = "./base.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome Product CRUD App!</h1>
	               <table class="table">
					  <thead class="thead-dark">
					    <tr>
					      <th scope="col">Product ID</th>
					      <th scope="col">Product Name</th>
					      <th scope="col">Product Description</th>
					      <th scope="col">Product Price</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  <tbody>
					  <c:forEach items="${products}" var="p">
					    <tr>
					      <th scope="row">${p.pid}</th>
					      <td>${p.pname}</td>
					      <td>${p.pdesc}</td>
					      <td>&#8377;${p.price}</td>
					      <td><a href="updateProduct/${p.pid}">
					      <i class="fas fa-pen-nib"></i></a>
					      </td>
					      
					      <td><a href="deleteProduct/${p.pid}">
					      <i class="fas fa-trash"></i></a>
					      </td>
					       </tr>
						 </c:forEach>
					  </tbody>
				  </table>
				  <div class= "container text-center">
				  	<a href="addProduct" class ="btn btn-outline-success"> Add Product </a>
				  </div>
			</div>
		</div>
	</div>
</body>
</html>