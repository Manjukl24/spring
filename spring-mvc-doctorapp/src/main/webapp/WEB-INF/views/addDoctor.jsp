<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Doctor</title>
</head>
<body>
<div>
<h1>Adding a Doctor Record</h1>
<a href="index.jsp"><button>Go back to Home Page</button></a>
</div>
<hr>
<fieldset>
<legend align="center">Doctor details</legend>
<form action="addDoctor" method="post">
<table align="left"  border="2">
<tr>
<td>Enter Doctor Name</td>
<td ><input type="text" name="doctorname" placeholder="Enter Doctor Name"></td>
</tr>
<tr>
<td>Enter speciality</td>
<td>
<select name="speciality">
<option value="ORTHO">ORTHOPRDIC</option>option>
<option value="PEDIA">PEDIATRICIAN</option>option>
<option value="PHYSICIAN">GENREAL PHYSICIAN</option>option>
<option value="NEURO">NEUROLOGIST</option>option>
<option value="DERMA">DERMATOLOGIST</option>option>
</select>
</td>
</tr>
<tr>
<td>Enter Consultation fees</td>
<td><input type="number" name="fees" placeholder="Enter Consultion fees"></td>
</tr>
<tr>
<td>Enter Experience </td>
<td><input type="number" name="Experience" placeholder="Enter Doctor Experience "></td>
</tr>
<tr>
<td>Enter Ratings </td>
<td><input type="number" name="Ratings" placeholder="Enter Doctor Ratings"></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="reset"></td>

</tr>
</table>
</form>
</fieldset>
</body>
</html>