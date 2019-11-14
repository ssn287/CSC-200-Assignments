/**
 * Day class is used to perform multiple operations for the day of the week.
 * @author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/28/2015
 * Purpose: Assignment 6
 */

public class Day {
	//initializing the instance variables
	private String day;
	private String [] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	/**
	 * constructor for creating the Day object with no parameters
	 */
	public Day() {
		this.day = "Mon";
	}
	/**
	 * constructor for creating the Day object by entering the day of the week
	 * @param day of the week
	 */
	public Day(String day) {
		this.day = day;
	}
	/**
	 * get method for the Day object
	 * @return day of the week
	 */
	public String getDay() {
		return day;
	}
	/**
	 * set method for the Day object
	 * @param day of the week
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * get method for the array index
	 * @param day of the week
	 * @return array index
	 */
	private int getDayIndex(String day) {
		for(int i = 0; i < days.length; i++) {
			if (days[i] == this.day) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * method for adding days to the day of the week
	 * @param number of days to add
	 * @return new day of the week
	 */
	public String calculateDay(int num) {
		String message = "";
		int dayIndex = getDayIndex(this.day);
		if(dayIndex != -1) {
			message = days[(dayIndex + num) % 7];
		}
		else {
			message = "Invalid Day!";
		}
		return message;
	}
	/**
	 * method to get the previous day of the week
	 * @return previous day of the week
	 */
	public String previousDay() {
		if(getDayIndex(this.day) == 0) {
			return calculateDay(6);
		}
		else{
			return calculateDay(-1);
		}
	}
	/**
	 * method to get the next day of the week
	 * @return next day of the week
	 */
	public String nextDay() {
		return calculateDay(1);
	}
	/**
	 * overrides default toString method
	 */
	public String toString() {
		return "Day: " + day;
	}
}