<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ include file = "header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script>
	function getValue()
	{
		var x="";
		x+="Select Your Role<br>";
		$.ajax({
		      type : "Get",
		      headers: {  'Access-Control-Allow-Origin': 'http://localhost:8080/billpayment/roles/getAllRoles.web' },
		      contentType : "application/json",
		      url : "http://localhost:8080/billPayment/roles/getAllRoles.web",
		      dataType : 'json',
		      success : function(result)
		      {
		    	 for(var a = 0 ; a<result.length ; a++)
		    	{
		    		x+="<input type=\"radio\" name=\"role\" value="+result[a].rolename+" onChange=\"register()\">"+result[a].rolename+"&nbsp;"; 	 
		    	}
		    	
		    	document.getElementById("result").innerHTML=x;
		      },
		      error : function(e) {
		        alert("Error!")
		        console.log("ERROR: ", e);
		      }
		    });
		      
	}
	function register()
	{
		var x="";
		var y="";
		var ele = document.getElementsByName('role'); 
        
        for(i = 0; i < ele.length; i++) { 
            if(ele[i].checked) 
            	x=ele[i].value; 
        } 
        if(x=='user' || x=='vendor')
			document.getElementById("result").innerHTML="<input type=\"hidden\" name=\"role\" value="+x+">";
		if(x=='admin')
			document.getElementById("result").innerHTML="";
		
    }

	
	</script>
</head>
<body onload="getValue()">

<div align="center">
			<h1>Registration Form</h1>
		 <form action="register/addUser.web" method="POST">
			<table>
				<tr>
				   	<td><p id="result"></p></td>
				</tr>
				<tr>
					 <td>Enter Your First Name:</td>
				   	<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					 <td>Enter Your Last Name:</td>
				   	<td><input type="text" name="lastname"></td>
				</tr>
				
				<tr><td>
				<input type="radio" id="male" name="gender" value="male">
  				<label for="male">Male</label><br>
  				</td></tr>
  				<tr>
  				<td>
  				<input type="radio" id="female" name="gender" value="female">
 				 <label for="female">Female</label><br>
				</td>
				</tr>
				
				<tr>
					<td>Enter your address</td>
					<td><input type="text" name="address"></td>
				</tr>
				
				<tr>
					<td>Enter Your password:</td>
					<td><input type="password" name="password"></td>
				</tr>
					<tr><td><input type="submit"></td></tr>
			</table>
		</form>
</div>
</body>
</html>