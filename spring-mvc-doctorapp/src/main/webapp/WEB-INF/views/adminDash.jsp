<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administraion Dashboard</title>
<link rel="stylesheet" href="./css/styles.css">
</head>
<body>
<div>
<h1> Admin Dashboard</h1>
<a href="index.jsp" style="padding-right: 20px;"><button>Go back Home Page</button></a>
<br>
<fieldset>
<legend align ="fullscreen"> GET TO KNOW </legend>
<table align="left" border="2">
<tr>
<td>Add Doctor</td>
<td><a href="addDoc.jsp"><button>Add a Doctor</button></a> </td>
</tr>
<tr>
<td>Delete Doctor</td>
<td><a href="deleteDoc.jsp"><button>Delete a Doctor</button></a> </td>
</tr>
<tr>
<td>Update Doctor</td>
<td><a href="updateDoc.jsp"><button>Update a Doctor</button></a> </td>
</tr>
<tr>
<td>Edit Doctor</td>
<td><a href="editDoc.jsp"><button>Edit a Doctor</button></a> </td>
</tr>
</table>
</fieldset>
</body>
</html>