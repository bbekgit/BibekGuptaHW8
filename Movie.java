import java.text.DecimalFormat;
import java.text.NumberFormat;

/** Program header:  Movie.java
 *
 * Author:    Bibek Gupta
 * Class:     Intro to OOP Java, MW 9:30 AM - 10:50 AM; Heining Chen
 *
 * Brief Program Description:
 *   There is title and director are of String type; year is of int type; product cost is of double type measured in million dollars
 *   There two constructors, one is the default constructor with no parameter, and the other has all four parameters to 
 *   initialize the four private data fields, respectively.
 *   There is a public getter and a public setter for each of the four private data fields.   
 */

public class Movie {
	// title and director are of String type; year is of int type; product cost is of double type measured in million dollars
	
	private String title;
	private String director;
	private int year;
	private double productCost;
	
	
	//default constructor with no parameter goes here
	public Movie(){
		
	}
	
	//all four constructors goes here
	public Moive(String title, String director, int year, double productCost) {
		
		this.title = title;
		this.director = director;
		this.year = year;
		this.productCost = productCost;
		
	}
    
    //getter for title
	public String getTitle() {
		return title;
	}
    //setter for title
	public void setTitle(String title) {
		this.title = title;
	}
    //getter for director
	public String getDirector() {
		return director;
	}
    //setter for director
	public void setDirector(String director) {
		this.director = director;
	}
    //getter for year
	public int getYear() {
		return year;
	}
    //setter for year
	public void setYear(String year) {
		this.year = year;
	}
    //getter for product cost
	public double getProductCost() {
		return productCost;
	}
    //setter for product cost
	public void setProductCost(double productcost) {
		this.productCost = productCost;
	}
   
	}
	
	

