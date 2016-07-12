<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>StudentDetails-Amulya Reddy</title>
	<link rel="stylesheet" href="style.css"/>
</head>
<body>
	<div id="header_bar"><div id="heading">Department of Computer Science</div></div> 
    <fieldset><h1>Student Details</h1>
	 <table>
		<tr><th>Id:</th><td>${studentData.getSid()}</td></tr> 
		<tr><th>Name:</th><td>${studentData.getFname()} ${studentData.getLname()}</td></tr>
		<tr><th>Address:</th><td>${studentData.getAddr()}, ${studentData.getCity()}, ${studentData.getState()} ${studentData.getZip()}</td></tr>
		<tr><th>Telephone #:</th><td>${studentData.getTelno()}</td></tr>
		<tr><th>Email Id:</th><td>${studentData.getEmail()}</td></tr>
		<tr><th>Homepage Url:</th><td>${studentData.getUrl()}</td></tr>
		<tr><th>Campus features that were liked:</th><td>${studentData.getCb()}</td></tr>
		<tr><th>How did you find out about the university:</th><td> ${studentData.getRadio()}</td></tr>
		<tr><th>Likelihood to recommend this school:</th><td> ${studentData.getReco()}</td></tr>
		<tr><th>Graduating Month:</th><td> ${studentData.getMonth()}</td></tr>
		<tr><th>Graduating Year:</th><td> ${studentData.getYear()}</td></tr>
		<tr><th>Additional Comments:</th><td> ${studentData.getAdCmt()}</td></tr>		
		<tr><th>Date Of Survey:</th><td> ${studentData.getDos()}</td></tr>
	 </table>
	</fieldset>
	<br><br>
	<a href="index.html"><button>Return to Survey Page</button></a>
	<br><br><br><br>
 	<div id="footer">
	  <font color="grey" size="2">Created By: <b>Amulya Reddy</b></font>
	  <a href="http://www.gmu.edu/" title="Please visit http://www.gmu.edu for more information. (Click on the logo to visit the site.)"><img id="gmuLogo" align="right" width="200px" src="GMU_LOGO.jpg"/></a>
    </div>
</body>
</html>