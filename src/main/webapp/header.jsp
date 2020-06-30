<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>


body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: lightblue;
  
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}



.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}

.fixed-footer{
        width: 100%;
        position: fixed;        
        background: lightblue;
        padding: 10px 0;
    }
    .fixed-footer{
        bottom: 0;
    }    

</style>
</head>
<body>

<div class="header">
  <a href="/billPayment/" class="logo">Home</a>
  <div class="header-right">
    <a  href="login.jsp">Login</a>
    <a  href="register.jsp">Register</a>
  </div>
</div>

 <div class="fixed-footer">
        <div class="container"><b>Copyright &copy; 2016 Your Company</b></div>        
    </div>

</body>
</html>
