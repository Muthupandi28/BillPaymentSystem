<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file = "header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
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
		    	
		    	document.getElementById("demo").innerHTML=x;
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
		if(x=="user" || x=="vendor")
		{
			y+='<object type="text/html" width=\"500\" height=\"500\" data="register.html" ></object>';
		}
		if(x=="admin")
		{
			y+="<h1>Weclome Admin</h1>";
		}
		console.log(y);
		document.getElementById("result").innerHTML=y;
	}
	
</script>
</head>
<body  >
<div align="center">
	<p id="demo"> WELCOME TO THE BILLPAYMENT PROJECT</p>
	<p id="result"></p>
</div>
</body>
</html>