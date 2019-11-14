/**
 * DayDriver class is used to test the methods of the Day class.
 * @author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/28/2015
 * Purpose: Assignment 6
 */

public class DayDriver {
	//main method
	public static void main(String [] args) {
		//initializing the Day object
		Day day = new Day();
		//testing the methods from the Day class
		System.out.println(day.toString());
		System.out.println("Get Day: " + day.getDay());
		System.out.println("Next Day: " + day.nextDay());
		System.out.println("Previous Day: " + day.previousDay());
		System.out.println("Add 8 Days: " + day.calculateDay(8));
		day.setDay("Sun");
		System.out.println(day.toString());
		System.out.println("Get Day: " + day.getDay());
		System.out.println("Next Day: " + day.nextDay());
		System.out.println("Previous Day: " + day.previousDay());
		System.out.println("Add 12 Days: " + day.calculateDay(12));
	}
}