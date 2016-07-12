/**
 * @author Amulya Reddy
 * SWE642-HW5
 *  
 * This action class is responsible for handling the user interactions(which are routed through struts.xml).
 */
package controller;

import java.io.IOException;

import javax.servlet.ServletException;

import com.opensymphony.xwork2.ActionSupport;

import model.DataBean;
import model.StudentBean;
import business.DataProcessor;
import business.StudentDAO;

public class StAxn extends ActionSupport {
	private static final long serialVersionUID = 1L;
	//data from the survey page
	private String sid ;
	private String fname;
	private String lname;
	private String addr;
	private String city;
	private String state;
	private String zip;
	private String telno;
	private String email;
	private String url;
	private String cb;
	private String radio;
	private String reco;
	private String month;
	private String year;
	private String adCmt;
	private String dos;
	private String data;
	private String[] sidList;
	private StudentBean studentBean;
	
	public String getData() {
		return data;
	}
	public void setData(String sid) {
		this.data = sid;
	}	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCb() {
		return cb;
	}
	public void setCb(String cb) {
		this.cb=cb;
	}
	public String getRadio() {
		return radio;
	}
	public void setRadio(String radio) {
		this.radio = radio;
	}
	public String getReco() {
		return reco;
	}
	public void setReco(String reco) {
		this.reco = reco;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAdCmt() {
		return adCmt;
	}
	public void setAdCmt(String adCmt) {
		this.adCmt = adCmt;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String[] getSidList() {
		return sidList;
	}
	public void setSidList(String[] sidList) {
		this.sidList = sidList;
	}
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	
	//Mean and Standard deviation
	private float mean1;
	private double sd1;
	public float getMean1() {
		return mean1;
	}
	public void setMean1(float mean1) {
		this.mean1 = mean1;
	}
	public double getSd1() {
		return sd1;
	}
	public void setSd1(double sd1) {
		this.sd1 = sd1;
	}
	public String execute() throws IOException, ServletException{
//		System.out.println("in the execute method");
		StudentDAO stdDao= new StudentDAO();
		stdDao.saveForm(sid,fname,lname,addr,zip,city,state,telno,email,url,cb,radio,reco,month,year,adCmt,dos,data);
		DataProcessor dataDao=new DataProcessor();
		float mean=dataDao.calMean(data);
		double sd=dataDao.calSd(data,mean);
		mean1=mean;
		sd1=sd;
		DataBean dataBean=new DataBean();
		dataBean.setMean(mean);
		dataBean.setStdDev(sd);
		String sidStr=stdDao.retrieveAllIds();
		sidList = sidStr.split(",");
		if (dataBean.getMean() >= 90)
			return  "winner";
		else
			return  "simple"; 
	}
	
	public String doGetDets(){
//		System.out.println("in doGetDets method");
		StudentDAO stdDao = new StudentDAO();
		studentBean=stdDao.retrieveForm(sid);
		String sidStr=stdDao.retrieveAllIds();
		sidList = sidStr.split(",");
		if (studentBean != null)
			return "success";
		else 
			return "error";		
	}
}
