<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateLead" method="post" >
<pre>

<input type ="hidden" name="id" value="${lead.id}"/>


First name <input type="text" name="FirstName" value="${lead.firstName}"/>

Last name  <input type="text" name="LastName" value="${lead.lastName}"/>

Email      <input type="text" name ="email" value="${lead.email}"/>

Mobile     <input type="text" name="mobile" value="${lead.mobile}"/>

 <input type = "submit" value="save"/>
</pre>

</form>

</body>
</html>