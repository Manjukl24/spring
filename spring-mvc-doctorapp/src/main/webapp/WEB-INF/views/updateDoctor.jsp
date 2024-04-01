<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Doctor</title>
</head>
<body>
<h1>Update the Doctor Record</h1>
<a href="index.jsp"><button>go back to home page</button></a>
<fieldset>
<legend align="center">Update Doctor</legend>
<form action="updateDoctor" method="post">
<table align="left" border="2">
<tr>
<td>Enter DoctorId</td>
<td><input type="number" name="doctorId" placeholder="enter the doctor id"  value="${doctor.doctorId }" readonly></td>
</tr>

<tr>
<td>Enter DoctorName</td>
<td><input type="text" name="doctorName" placeholder="enter the doctor name"  value="${doctor.doctorname }" readonly></td>
</tr>

<tr>
<td>Select Speciality</td>
<td>
<select name="speciality" readonly>
<option>${doctorObj.speciality }</option>
</select>
</td>
</tr>
<tr>
<td>Enter Consultation Fees</td>
<td><input type="number" name="fees" placeholder="Enter Consultation Fees" value="${doctorObj.consultation }"/></td>
</tr>

<tr>
<td>Enter Experience</td>
<td><input type="number" name="experience" placeholder="Enter Consultation Experience" value="${doctorObj.experience}"readonly/></td>
</tr>

<tr>
<td>Enter Ratings</td>
<td><input type="number" name="ratings" placeholder="Enter Consultation ratings" value="${doctorObj.Ratings}"readonly/></td>
</tr>
<tr>
<td colspan=2><input type="submit" value="Submit">
<input type="reset" value="Reset"></td>
</tr>
</table>
</form>
</fieldset>
</body>
</html>