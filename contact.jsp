<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="contactform" method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">ID</label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter id" name="id">
   </div>
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Name</label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter name" name="name">
   </div>
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Age</label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Age" name="age">
   </div>
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Gender</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter gender" name="gender">
   </div>
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Phno</label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter phno" name="phno">
   </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>