<%@ page import="com.unab.clase.ejercicio.DAO.ClsArchivos"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href=archivos.jsp>Volver a la pagina anterior</a><br>
<%ClsArchivos Imagen = new ClsArchivos();
  String nombreimg = Imagen.seleccionararchivos(); %>
	<br><img alt="" src="Files/<%=nombreimg%>" width=200 height=150>
</body>
</html>