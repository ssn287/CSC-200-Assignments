/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 3/1/2015
 * Purpose: Write a Java Application to prompt the user for five numbers and display the results below:
 * 	Sum
 * 	Average
 * 	Max (Extra Credit)
 * 	Min (Extra Credit)
 * 	Median (Extra Credit)
 * 	Mode (Extra Credit)
 */

import java.util.Scanner;

public class Assignment2pt2 {
	public static void main(String [] args) {
		//declaring variables
		double num1, num2, num3, num4, num5, sum, mean;
		Scanner keyboard;
		//defining Scanner variable
		keyboard = new Scanner(System.in);
		//prompting the user to define variables
		System.out.println("Please enter five numbers:");
		num1 = keyboard.nextDouble();
		num2 = keyboard.nextDouble();
		num3 = keyboard.nextDouble();
		num4 = keyboard.nextDouble();
		num5 = keyboard.nextDouble();
		//calculating sum and average using user inputs
		sum = (num1 + num2 + num3 + num4 + num5);
		mean = sum / 5;
		//displaying the results
		System.out.println("The sum of those five numbers is: " + sum);
		System.out.println("The mean average of those five numbers is: " + mean);
		keyboard.close();
	}
}