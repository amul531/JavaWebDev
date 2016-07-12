<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>WinnerAck-Amulya Reddy</title>
	<link rel="stylesheet" href="style.css"/>
</head>
<body>
	<div id="header_bar">
		<div id="heading">Department of Computer Science</div>
	</div> 
	<br>
		<div id="idList">
		<br>
	      <h3>All Student IDs</h3>
	 	  <table>
	 	  <%
	 	   String[] ids = (String[])request.getAttribute("id_jsp");
		   for (int i=0;i<ids.length;i++) {
		   String stdId = ids[i];
		  %>		
		  <tr><td><a href="/Swe642Trial/MainServlet?id=<%=stdId%>"><%=stdId%></a></td></tr>		
		  <%  }  %>
		  </table>
	</div>

	<br>
	<div id="content">
	<fieldset>
    <h1>Congrulations!</h1>
	<b>You have won two movie tickets!</b><br/>
		<table border="1">
			<tr><th colspan="2">Data Stats</th></tr>
			<tr><th>Mean</th><td class="result">${dataBean.getMean()}</td></tr>
			<tr><th>Standard Deviation</th><td class="result">${dataBean.getStdDev()}</td></tr>
		</table>
		<br><br><br>
		<a href="index.html"><button>Return to Survey Page</button></a>
		</fieldset>
     </div>		
 	<div id="footer">
	  <font color="grey" size="2">Created By: <b>Amulya Reddy</b></font>
	  <a href="http://www.gmu.edu/" title="Please visit http://www.gmu.edu for more information. (Click on the logo to visit the site.)"><img id="gmuLogo" align="right" width="200px" src="GMU_LOGO.jpg"/></a>
    </div>
</body>
</html>