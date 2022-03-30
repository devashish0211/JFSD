<html>
<head>
	<style>
		.center {
	  		text-align: center;
	  		align-items:center;
	  		
	  	}
	  	a{
	  	text-decoration:None;
	  	color:black;
	  	}
	  	body {
    			text-align: center;
			}
		form {
    			display: inline-block;
			}
	  	
	</style>
</head>
<body style="background-color:lightblue;">
	<div class="center">
		<h1>User Manager</h1>
		
		<h2 class="hello-title">Search for a User and Update Information</h2>
		
		
		<br><br>
		
		<form method="post" action="update">
		<fieldset style="height: 100px; width:500px ">
			Enter id : <input type="text" id="id" name="id" placeholder="Type here" required>
			<br>
			<br>
			<input type="submit" value="Submit" /> &nbsp;&nbsp;&nbsp;
			<button><a href="/users">View user table</a></button>
			</fieldset>
		</form>
		
	</div>
</body>
</html>

