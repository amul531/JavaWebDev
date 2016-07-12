/**
 * @author Amulya Reddy
 * SWE642-HW4
 * 
 * This class contains the business logic for storing and reading the Survey data to/from the db.
 */
package amul;
import amul.StudentBean;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "StudentDAO", urlPatterns = {"/StudentDAO"})

public class StudentDAO {
	
	//saving details to database
	public void saveForm(HttpServletRequest request) throws ServletException,
    IOException {
        String sid = request.getParameter("sid");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String addr = request.getParameter("addr");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String telno = request.getParameter("telno");
        String email = request.getParameter("email");
        String url = request.getParameter("url");
        String[] cVals = request.getParameterValues("cb");
        String radio = request.getParameter("radio");
        String reco = request.getParameter("reco");
        String month = request.getParameter("month");
        String year = request.getParameter("year");
        String adCmt = request.getParameter("adCmt");
        String dos = request.getParameter("dos");
        String cTemp="";
        StudentBean StdBean = new StudentBean();

        StdBean.setSid(sid);
        StdBean.setFname(fname);
        StdBean.setLname(lname);
        StdBean.setAddr(addr);
        StdBean.setCity(city);
        StdBean.setState(state);
        StdBean.setZip(zip);
        StdBean.setTelno(telno);
        StdBean.setEmail(email);
        StdBean.setUrl(url);
        for (int i = 0; i < cVals.length; i++)
        	cTemp = cTemp + cVals[i] + " ";
        StdBean.setCb(cTemp);
        StdBean.setRadio(radio);
        StdBean.setReco(reco);
        StdBean.setMonth(month);
        StdBean.setYear(year);
        StdBean.setAdCmt(adCmt);
        StdBean.setDos(dos);
        
        System.out.println(StdBean.getFname());
        System.out.println(StdBean.getLname());
        System.out.println(StdBean.getAddr());
        System.out.println(StdBean.getZip());
        System.out.println(StdBean.getCity());
        System.out.println(StdBean.getState());
        System.out.println(StdBean.getTelno());
        System.out.println(StdBean.getEmail());
        System.out.println(StdBean.getDos());
        System.out.println(StdBean.getCb());
        System.out.println(StdBean.getRadio());
        System.out.println(StdBean.getReco());
        System.out.println(StdBean.getAdCmt());
        System.out.println(StdBean.getUrl());
        System.out.println(StdBean.getMonth());			
        System.out.println(StdBean.getYear());
        System.out.println(StdBean.getSid());
        
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	Connection con;
        	con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "areddy5", "gleeri");
        	System.out.println("Connection established");
        	String sql = "insert into surveyData values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        	System.out.println("Connection established");	           
        	PreparedStatement prepared = con.prepareStatement(sql);
        	System.out.println("Connection established");
        	prepared.setString(1, StdBean.getSid());
        	prepared.setString(2, StdBean.getFname());
        	prepared.setString(3,StdBean.getLname());
        	prepared.setString(4, StdBean.getAddr());
        	prepared.setString(5, StdBean.getCity());
        	prepared.setString(6, StdBean.getState());
        	prepared.setString(7, StdBean.getZip());
        	prepared.setString(8, StdBean.getTelno());
        	prepared.setString(9, StdBean.getEmail());
        	prepared.setString(10, StdBean.getUrl());
        	prepared.setString(11, StdBean.getCb());
        	prepared.setString(12, StdBean.getRadio());
        	prepared.setString(13, StdBean.getReco());
        	prepared.setString(14, StdBean.getMonth());
        	prepared.setString(15, StdBean.getYear());
        	prepared.setString(16, StdBean.getAdCmt());
        	prepared.setString(17, StdBean.getDos());  
        	System.out.println("statement prepared");
        	prepared.executeUpdate();
        	System.out.println("executing data insert");
        	prepared.close();
        	System.out.println("closing db connection");
        	if (con != null)
        		con.close();
        } catch (SQLException | ClassNotFoundException ex) {
	            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}//end of save
	
	
	//retrieving details from database
	public StudentBean retrieveForm(String id) {
		StudentBean StdBean = new StudentBean();
		System.out.println("entered");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "areddy5", "gleeri");
			Statement stmt = con.createStatement();
			System.out.println("connection established");
			System.out.println(id);
			id="'"+id+"'";
			System.out.println("Select * from surveyData where sid =" + id);
			ResultSet result = stmt.executeQuery("Select * from surveyData where sid =" + id);
			while (result.next()) {
				System.out.println("entered retirieve");
				StdBean.setSid(result.getString(1));	                
				StdBean.setFname(result.getString(2));
				StdBean.setLname(result.getString(3));
				StdBean.setAddr(result.getString(4));
				StdBean.setCity(result.getString(5));
				StdBean.setState(result.getString(6));
				StdBean.setZip(result.getString(7));
				StdBean.setTelno(result.getString(8));
				StdBean.setEmail(result.getString(9));
				StdBean.setUrl(result.getString(10));
				StdBean.setCb(result.getString(11));
				StdBean.setRadio(result.getString(12));
				StdBean.setReco(result.getString(13));
				StdBean.setMonth(result.getString(14));
				StdBean.setYear(result.getString(15));
				StdBean.setAdCmt(result.getString(16));
				StdBean.setDos(result.getString(7));
				System.out.println("fininshed retirieve");
			}
			System.out.println("exit");
	        System.out.println(StdBean.getReco());
	        con.close();
		} catch (Exception e) { }
		return StdBean; 
	}//end of retrieve
}