<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file = "header.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	function loginCheck()
	{
		 // PREPARE FORM DATA
	      var formData = {
	        firstname:document.getElementById("firstname").value,
	        password:document.getElementById("password").value
	      }
	      console.log(JSON.stringify(formData));
	      // DO POST
	      $.ajax({
	    	  url :"http://localhost:8080/billPayment/register/authenticateUser.web",
	      type : "post",
	      contentType : "application/json",
	      
         data : JSON.stringify(formData),
	      dataType : 'json',
	      success : function(result) {
	        console.log(result);
	      },
	      error : function(e) {
	        alert("Error!")
	        console.log("ERROR: ", e);
	      }
	    });
	      
	}

</script>


</head>
<body>
	
		ENTER YOUR USERNAME:
			<input type="text" name="firstname" id="firstname"><br>
		ENTER YOUR PASSWORD:
			<input type="password" name="password" id="password"><br>
			<input type="submit" onClick="loginCheck()" value="Login">
		
	
</body>
</html>