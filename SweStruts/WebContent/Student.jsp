<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.HashMap"%>
    <%@page import=" java.util.Iterator"%>
    <%@page import=" java.util.*"%>
  	<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>StudentDetails-Amulya Reddy</title>
	<link rel="stylesheet" href="style.css"/>
</head>
<body>
	<div id="header_bar"><div id="heading">Department of Computer Science</div></div> 
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<br>
	<div id="idList">
	<table align="center">	

		</table>
	      <h3>All Student IDs</h3>
	 	  <table>
			<s:iterator value="sidList">
			<tr><td><a href="NextAxn?sid=<s:property/>"><s:property /></a></td></tr>
			</s:iterator>	
		  </table>
	</div><br>
	<div id="content">
    <fieldset><h1>Student Details</h1>
	 <table>
		<tr><th>Id:</th><td><s:property value="studentBean.sid"/></td></tr> 
		<tr><th>Name:</th><td><s:property value="studentBean.fname"/> <s:property value="studentBean.lname"/></td></tr>
		<tr><th>Address:</th><td><s:property value="studentBean.addr"/>, <s:property value="studentBean.city"/>, <s:property value="studentBean.state"/> <s:property value="studentBean.zip"/></td></tr>
		<tr><th>Telephone #:</th><td><s:property value="studentBean.telno"/></td></tr>
		<tr><th>Email Id:</th><td><s:property value="studentBean.email"/></td></tr>
		<tr><th>Homepage Url:</th><td><s:property value="studentBean.url"/></td></tr>
		<tr><th>Campus features that were liked:</th><td><s:property value="studentBean.cb"/></td></tr>
		<tr><th>How did you find out about the university:</th><td><s:property value="studentBean.radio"/></td></tr>
		<tr><th>Likelihood to recommend this school:</th><td><s:property value="studentBean.reco"/></td></tr>
		<tr><th>Graduating Month:</th><td><s:property value="studentBean.month"/></td></tr>
		<tr><th>Graduating Year:</th><td><s:property value="studentBean.year"/></td></tr>
		<tr><th>Additional Comments:</th><td><s:property value="studentBean.adCmt"/></td></tr>		
		<tr><th>Date Of Survey:</th><td><s:property value="studentBean.dos"/></td></tr>
		</table>
		<br><br><br><a href="index.html"><button>Return to Survey Page</button></a><br><br>
		</fieldset>
     </div>
     <br><br><br>
 	<div id="footer">
	  <font color="grey" size="2">Created By: <b>Amulya Reddy</b></font>
	  <a href="http://www.gmu.edu/" title="Please visit http://www.gmu.edu for more information. (Click on the logo to visit the site.)"><img id="gmuLogo" align="right" width="200px" src="GMU_LOGO.jpg"/></a>
    </div>
</body>
</html>