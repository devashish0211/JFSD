<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<style>
	table, th, td {
	  border: 1px solid black;
	  	  margin: auto;
	  
	}
	.center {
 		text-align: center;
 		align-items:center;
 	}
 	body {
    text-align: center;
			}
form {
    display: inline-block;
}
	</style>
</head>
<body style="background-color:lightblue;" >
	<div class="center">
		<h2>Update Table</h2>
		
		<p> User ID: ${ID}</p>
		<table style="float:inherit">
		   <tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
		   <c:forEach items="${user}" var="userE" varStatus="count">
		    <tr id="${count.index}">
		    	<td>${userE.id}</td>
		        <td>${userE.name}</td>
		        <td>${userE.email}</td>
		        <td>${userE.password}</td>
		    </tr>
			</c:forEach>
		</table>
		<br><br>
		<form method="post" action="update2" class="center">
		<fieldset style="width:400px">
			<br><h3>Edit user: ${ID}</h3>
			<label for=nameedit>Name:</label>
			<input type="text" id="nameedit" name="nameedit" placeholder="Enter name here..." required> 
			<br><br>
			<label for=emailedit>Email:</label>
			<input type="text" id="emailedit" name="emailedit" placeholder="Enter Email here..." required>
			<br><br>
			<label for=passwordedit>Password:</label>
			<input type="password" id="passwordedit" name="passwordedit" placeholder="Enter Password here..." required>	
			<br>
			<br>
			<input type="submit" value="Enter" />
			</fieldset>
		</form>
	</div>
</body>
</html>