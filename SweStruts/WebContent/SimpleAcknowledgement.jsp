<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.HashMap"%>
    <%@page import=" java.util.Iterator"%>
    <%@page import=" java.util.*"%>
  	<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>SimpleAck-Amulya Reddy</title>
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
	<fieldset>
		<h1>Thank you for filling out the survey!</h1>
		<p>Your details have been successfully saved. <br>Below are the results of your number data.</p>
		<table border="1">
			<tr><th colspan="2">Data Stats</th></tr>
			<tr><th>Mean</th><td class="result"><s:property value="mean1" /></td></tr>
			<tr><th>Standard Deviation</th><td class="result"><s:property value="sd1" /></td></tr>
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