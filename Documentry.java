import java.text.DecimalFormat;
import java.text.NumberFormat;

/** Program header:  Documentry.java
 *
 * Author:    Bibek Gupta
 * Class:     Intro to OOP Java, MW 9:30 AM - 10:50 AM; Heining Chen  
 *
 * Brief Program Description:
 *   The two private data fields are int type.
 *  There are two constructors, one is the default constructor with no parameter, and the other has all  parameters to initialize 
 *  There should be a public getter and setter for each of the two private data fields.
 *     have regular getter and setter for the data members.
 */


public class Documentry extends Movie {
	//The two private data fields 
	private int numberOfDistributors;
	private double premiumPaid;
	
	
	//the default constructor with no parameter
	public Documentry(){
	
	}
    //the other having all  parameters
	public Documentry(String title, String director, int year, double productCost, int numberOfDistributors, double premiumPaid) {
		super(title, director, year, productCost);
		this.numberOfDistributors = numberOfDistributors;
		this.premiumPaid = premiumPaid;
	}
    //getter for number of distributors
	public int getNumberOfDistributors() {
		return numberOfDistributors;
	}
    // setter for number of Distributors
	public void setNumberOfDistributors(int numberOfDistributors) {
		this.numberOfDistributors = numberOfDistributors;
	}
    //getter for number of times at bat
	public int getNumberOfTimesAtBat() {
		return numberOfTimesAtBat;
	}
    //setter for premiumPaid
	public void setPremiumPaid(int premiumPaid) {
		this.premiumPaid = premiumPaid;
	}
	//calculate revenue. it return a double type.
	public double calculateRevenue(){
		return numberOfDistributors*premiumPaid;  
	}
	
		
	}

	


