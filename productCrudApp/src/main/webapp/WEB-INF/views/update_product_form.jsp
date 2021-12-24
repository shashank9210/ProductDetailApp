<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Load base.jsp file -->
<%@include file= "./base.jsp" %>
</head>
<body>
	<h1>This is Update Product Form</h1>
	
	<div class="container mt-3">
		<div class = "row">
			<div class = "col-md-6 offset-md-3">
				<h1 class="text-center mb-3"> Update the Product Details </h1>
					<form action="${pageContext.request.contextPath}/handleProduct" method="post">
						<div class="form-group">
							<label for="id">Product ID</label>
							<input type="text" class="form-control" id="pid" name="pid" aria-describedby="Product name"	placeholder ="Enter Product ID." value="${p.pid}">
						</div>
						
						<div class="form-group">
							<label for="pname">Product Name</label>
							<input type="text" class="form-control" id="pname" name="pname" aria-describedby="Product name"	placeholder ="Enter Product Name" value="${p.pname}">
						</div>
						
						<div class="form-group">
							<label for="productDesc">Product Description</label>
							<textarea class="form-control" id="productDesc" row=5 name="pdesc" aria-describedby="Product Description" placeholder ="Enter Product Description"> ${p.pdesc}</textarea>
						</div>
						
						<div class="form-group">
							<label for="price">Product Price</label>
							<input type="text" class="form-control" id="price" name="price" value="${p.price}" aria-describedby="Product Price" placeholder ="Enter Product Price" value="${p.price}">
						</div>
						
						<div container="container text-center">
							<a href="${pageContext.request.contextPath}" 
							class="btn btn-outline-danger">Back</a>
							<button type="submit" class="btn btn-primary"> Update Product</button>
						</div>
					
					</form>
			</div>
		</div>
	</div>
</body>
</html>