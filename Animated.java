import java.text.DecimalFormat;
import java.text.NumberFormat;

/** Program header:  Animated.java
 *
 * Author:    Bibek Gupta
 * Class:     Intro to OOP Java, MW 9:30 AM - 10:50 AM; Heining Chen  
 *
 * Brief Program Description:
 *  The two private data fields 
 *  There are two constructors, one is the default constructor with no parameter, and the other has all parameters to initialize 
 *  There are public getter and setter for each of the two private data fields.
 *    There are public method to calculate.
 */

public class Animated extends Movie {
	//The two private data fields 
	private double royaltyRate;
	private double income;
    //the default constructor with no parameter
	public Animated(){

	}
    //the other having all  parameters
	public FootballPlayer(String title, String director, int year, double productCost, double royaltyRate, double income) {
		super(title, director, year, productCost);
		this.royaltyRate = royaltyRate;
		this.income = income;
	}  
    //getter for royaltyRate
	public int getRoyaltyRate() {
		return royaltyRate;
	}
    //setter for royaltyRate
	public void setRoyaltyRate(int royaltyRate) {
		this.royaltyRate = royaltyRate;
	}
    //getter for income
	public int getIncome() {
		return income;
	}
    //setter for income
	public void setIncome(int income) {
		this.income = income;
	}
    //revenue calculator. this return a double type.
	public double calculateRevenue(){
		return royaltyRate*income;
	}
    
	}
	
	
	

