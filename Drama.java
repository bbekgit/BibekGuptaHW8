import java.text.DecimalFormat;
import java.text.NumberFormat;

/** Program header:  Drama.java
 *
 * Author:    Bibek Gupta
 * Class:     Intro to OOP Java, MW 9:30 AM - 10:50 AM; Heining Chen   
 *
 * Brief Program Description:
 *  The two private data fields 
 *  There are two constructors, one is the default constructor with no parameter, and the other has all parameters 
 *  There are public getter and setter for each of the two private data fields.
 *  There are two effector methods:
 */


public class Drama extends Movie{
	//The two private data fields 
	private int numberOfTicketsSold;
	private double avgPriceOfTicket;
	//the default constructor with no parameter
	public Drama(){
	
	}
    //the other having all parameters
	public Drama(String title, String director, int year, double productCost, int numberOfTicketsSold, double avgPriceOfTicket) {
		super(title, director, year, productCost);
		this.numberOfTicketsSold = numberOfTicketsSold;
		this.avgPriceOfTicket = avgPriceOfTicket;
	}
    //getter for number of TicketsSold
	public int getNumberOfTicketsSold() {
		return numberOfTicketsSold;
	}
    //setter for number of TicketsSold
	public void setNumberOfTicketsSold(int numberOfTicketsSold) {
		this.numberOfTicketsSold = numberOfTicketsSold;
	}
    //getter for avgPriceOfTicket
	public int getAvgPriceOfTicket() {
		return avgPriceOfTicket;
	}
    //setter for avgPriceOfTicket
	public void setAvgPriceOfTicket(int avgPriceOfTicket) {
		this.avgPriceOfTicket = avgPriceOfTicket;
	}
    //revenue calculator. this return a double type.
	public double calculateRevenue(){
		return numberOfTicketsSold*avgPriceOfTicket;
	}
	
	
	}
	


