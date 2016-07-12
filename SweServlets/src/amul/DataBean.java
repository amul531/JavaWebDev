/**
 * @author Amulya Reddy
 * SWE642-HW4
 * 
 * Java bean for mean and standard deviation.
 */
package amul;

public class DataBean {
	
	 private float mean;
	 private double stdDev;
	   
	  public float getMean() {
		  return mean;
	  }
	  public void setMean(float mean) {
		  this.mean = mean;
	  }

	  public double getStdDev() {
		  return stdDev;
	  }
	  public void setStdDev(double sd) {
		  this.stdDev = sd;  
	  }

}
