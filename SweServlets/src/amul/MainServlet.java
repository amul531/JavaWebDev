/**
 * @author Amulya Reddy
 * SWE642-HW4
 *  
 * This servlet is responsible for handling the user interactions.
 */
package amul;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//no arg constructor
    public MainServlet() {
        super();
    }

	//This method is called when the user selects a studentID from the list of ID's on the ack page.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO stu_dao1 = new StudentDAO();
		String ID1=request.getParameter("id");
		StudentBean stu_bean1=stu_dao1.retrieveForm(ID1);
		HttpSession session = request.getSession();
		session.setAttribute("studentData", stu_bean1);
		request.setAttribute("pid" , ID1);
		String gotoAddr;	
		if (stu_bean1 != null)
			gotoAddr = "/StudentDetails.jsp";
		else
			gotoAddr= "/NoSuchStudent.jsp";
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher(gotoAddr);
		dispatcher.forward(request, response);
	}//end of doGet
	
	/**
	 * This method is called when a user submits the survey form.
	 * On successful submission:The data is persisted.
	 * The uesr is then redirected to an acknowledgment page depending on the mean of their entered "data".  
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO stu_dao= new StudentDAO();
		stu_dao.saveForm(request);
		float mean;
		double sd;
		String datan=request.getParameter("data");
		DataProcessor data_proc=new DataProcessor();
		mean=data_proc.calMean(datan);
		sd=data_proc.calSd(datan,mean);
		DataBean data_bean=new DataBean();
		data_bean.setMean(mean);
		data_bean.setStdDev(sd);
		String id_string="";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "areddy5", "gleeri");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("Select sid from surveyData");
            while (result.next()) {
                id_string=id_string+result.getString(1)+",";
            }
            con.close();
		}
		catch (Exception e) { }
		String[] id_list = id_string.split(",");
		request.setAttribute("id_jsp", id_list);
		HttpSession session = request.getSession();
		session.setAttribute("dataBean", data_bean);	
		RequestDispatcher dispatcher;
		String ackAddr;
		if (data_bean.getMean() >= 90)
			ackAddr = "/WinnerAcknowledgement.jsp";
		else
			ackAddr = "/SimpleAcknowledgement.jsp";
		dispatcher = request.getRequestDispatcher(ackAddr);
		dispatcher.forward(request, response);	
	}//end of doPost
}
