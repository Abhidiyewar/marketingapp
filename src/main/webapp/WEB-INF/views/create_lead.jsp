<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file ="Menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert lead</title>
</head>
<body>
<h2>CREATE LEAD</h2>

<form action="SaveLead" method="post" >
<pre>
First name <input type="text" name="FirstName"/>

Last name  <input type="text" name="LastName"/>

Email      <input type="text" name ="email"/>

Mobile     <input type="text" name="mobile"/>

 <input type = "submit" value="save"/>
</pre>


</form>


${msg}
</body>
</html>