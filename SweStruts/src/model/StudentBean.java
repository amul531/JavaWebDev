/**
 * @author Amulya Reddy
 * SWE642-HW5
 * 
 * Java bean for all entries in the form except for "data".
 */
package model;

public class StudentBean {	
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
	private String[] sidList;
		
	//1-student ID
	public String getSid()  {
        return sid ;
    }
    public void setSid (String sid ) {
        this.sid  = sid ;
    }

    //2-firstname
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }	
    
    //3-lastname
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
	
    //4-addr
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    
    //5-city
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    //6-state
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    //7-zip
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    //8-telephone#
    public String getTelno() {
        return telno;
    }
    public void setTelno(String telno) {
        this.telno = telno;
    }

    //9-email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //10-homepage url
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }    

    //11-checkbox-what did you like about the campus
	public String getCb() {
        return cb;
    }
    public void setCb(String cb) {
    	
        this.cb = cb;
    }

    //12-radio-what about the university interested you
    public String getRadio() {
        return radio;
    }
    public void setRadio(String radio) {
        this.radio = radio;
    }
    
    //13-select-would you recommend this university
	public String getReco() {
        return reco;
    }
    public void setReco(String reco) {
        this.reco = reco;
    }
    
    //14-grad month
	public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }    
    
    //15-grad year
	public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    
    //16-additional comments
	public String getAdCmt() {
        return adCmt;
    }

    public void setAdCmt(String adCmt) {
        this.adCmt = adCmt;
    }
    
    //17-date of survey
    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }
    
    //18-list of student ids
	public String[] getSidList() {
		return sidList;
	}

	public void setSidList(String[] sidList) {
		this.sidList = sidList;
	}
}
