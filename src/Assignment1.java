/**
 * @author: ssn287
 * Author: Shelby Neal
 * Emplid: 6030859
 * Date: 2/8/2015
 * Email: ssn287@email.vccs.edu
 * Purpose: Assignment 1 (Page 43, Programming Project 6)
 *          Write an applet program that displays the following pattern: (picture in textbook)
 */

import javax.swing.JApplet;
import java.awt.Graphics;

public class Assignment1 extends JApplet {
	public void paint(Graphics canvas) {
		//using the drawArc method to paint semi-circles in JApplet
		canvas.drawArc(0, 100, 120, 120, 270, 180);
		canvas.drawArc(100, 0, 120, 120, 180, 180);
		canvas.drawArc(200, 100, 120, 120, 90, 180);
		canvas.drawArc(100, 200, 120, 120, 0, 180);
		//using the drawOval method to paint a circle in JApplet
		canvas.drawOval(120, 120, 80, 80);
		//using the fillOval method to paint a filled circle in JApplet
		canvas.fillOval(140, 140, 40, 40);
	}
}