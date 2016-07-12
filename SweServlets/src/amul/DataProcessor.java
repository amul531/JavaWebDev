/**
 * @author Amulya Reddy
 * SWE642-HW4
 * 
 * Calculates the mean and standard deviation for the 10 numbers entered in the form.
 */
package amul;

public class DataProcessor{
	
	//computes mean
    public float calMean(String data){
    	String nums[] = data.split(",");
    	float mean = 0;
    	for(int i=0; i< nums.length; i++)
    		mean =mean+ Integer.parseInt(nums[i]);
    	mean = mean/ nums.length;
    return mean;
    }
   
    //computes standard deviation
    public double calSd(String data, float mean){
    	String[] nums = data.split(",");
    	double tot=0;
    	double sd = 0;
		for(int i=0; i< nums.length; i++)
			tot = Math.pow((Integer.parseInt(nums[i]) - mean), 2); 
		sd =  Math.sqrt(tot/(nums.length));
		return sd;
    }
}