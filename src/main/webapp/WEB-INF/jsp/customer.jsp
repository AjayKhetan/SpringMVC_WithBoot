<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<h3>Customer</h3>
<br><br>
<center>
<form action="insertCustomer" method="post">

customer ID: <input type="text" name="customerId">
<br><br>

Customer FirstName: <input type="text" name="profile_firstname">
<br><br>

Customer LastName: <input type="text" name="profile_lasttname">
<br><br>

Wallet Balance: <input type="text" name="wallet_balance">
<br><br>

Wallet Type: <input type="text" name="wallet_type">
<br><br>

<input type="submit" value="Submit">

</center>
</form>
</body>
</html>