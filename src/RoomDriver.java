/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/8/2015
 * Purpose: Assignment 4
 */

public class RoomDriver {
	//main method
	public static void main(String [] args) {
		//creating objects from Room class
		Room room1 = new Room("yellow", "hard wood", 1);
		Room room2 = new Room("purple", "tiled", 0);
		Room room3 = new Room("white", "carpeting", 3);
		//printing attributes from created objects
		System.out.println("Room 1 Specifications: " + room1);
		System.out.println("Room 2 Specifications: " + room2);
		System.out.println("Room 3 Specifications: " + room3);
	}
}