<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="/Login" method="post" >
   <label>Student Name: </label><input type="text" id="uname" name="uname" >
   <br><br><label>Password:      </label><input type="password" id="pass" name="pass" ><br><br><br>
   <Button type="submit">Login</Button>
   </form>
   
   <form action="/LoginProfessor" method="post" >
   <label>Professor Name: </label><input type="text" id="uname" name="uname" >
   <br><br><label>Password:      </label><input type="password" id="pass" name="pass" ><br><br><br>
   <Button type="submit">Login</Button>
   </form>
</body>
</html>