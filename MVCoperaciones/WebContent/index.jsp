<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="ccs/style.css" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="sevletsoperaciones" method="post">
<label>Input your number:</label>
<input type="text" name="txtNumber1">

</br>
<label>input another number:</label>
<input type="text" name="txtNumber2">
<input type="submit" value="Accept">
</form>


<table>
	<thead><th>Usuarios</th><th>Contraseñas</th></thead>
	<tbody>
	<% for(int i=0; i<1000; i++)
	{
		out.println("<tr><td><input type=\"text\" name=\"admin"+i+
				"\" placeholder=\"admin"+i+
				"\"></td><td>admin"+i+"</td></tr>");
	}
%>
	<!-- 
	<tr><td>admin</td><td>admin</td></tr>
	<tr><td>admin2</td><td>admin2</td></tr>
	<tr><td>admin3</td><td>admin3</td></tr>
	<tr><td>admin4</td><td>admin4</td></tr>
	<tr><td>admin5</td><td>admin5</td></tr>
 -->
	</table>

</body>
</html>