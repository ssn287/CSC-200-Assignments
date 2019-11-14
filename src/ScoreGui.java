/**
 * ScoreGui class is used to calculate the weighted average of a group of test scores using a graphic user interface.
 * @author: Shelby Neal
 * Emplid: 6030859
 * Email: ssn287@email.vccs.edu
 * Date: 4/28/2015
 * Purpose: Assignment 5
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreGui extends JFrame implements ActionListener {
	//initializing the instance variables
	private final int SIZE = 4;
	private JButton jbtCalculate = new JButton("Calculate");
	private JTextField [] jtxtScore = new JTextField[SIZE];
	private JTextField [] jtxtWeight = new JTextField[SIZE];
	private JLabel [] jlblModuleName = new JLabel[SIZE];
	private JLabel [] jlblTitles = new JLabel[3];
	private JLabel jlblOutput = new JLabel("0.0");
	private JPanel scorePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private double [] scores = new double[SIZE];
	private double [] weights = new double[SIZE];
	/**
	 * constructor for creating the GUI
	 */
	public ScoreGui() {
		jlblModuleName[0] = new JLabel("Test 1");
		jlblModuleName[1] = new JLabel("Test 2");
		jlblModuleName[2] = new JLabel("Test 3");
		jlblModuleName[3] = new JLabel("Test 4");
		jlblTitles[0] = new JLabel("Test Number");
		jlblTitles[1] = new JLabel("Score");
		jlblTitles[2] = new JLabel("Weight");
		scorePanel.setBackground(Color.CYAN);
		scorePanel.setLayout(new GridLayout(5, 3));
		for(int i = 0; i < 3; i++) {
			scorePanel.add(jlblTitles[i]);
		}
		for(int i = 0; i < SIZE; i++) {
			scorePanel.add(jlblModuleName[i]);
			jtxtScore[i] = new JTextField(8);
			scorePanel.add(jtxtScore[i]);
			jtxtWeight[i] = new JTextField(8);
			scorePanel.add(jtxtWeight[i]);
		}
		buttonPanel.setBackground(Color.GREEN);
		buttonPanel.setLayout(new GridLayout(2, 1));
		jbtCalculate.addActionListener(this);
		buttonPanel.add(jbtCalculate);
		buttonPanel.add(jlblOutput);
		add(scorePanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}
	/**
	 * method for calculating the weighted average test score
	 * @return the weighted average test score
	 */
	public double calculateAvgScore() {
		double numberGrade = 0.0;
		for(int i = 0; i < SIZE; i++) {
			scores[i] = Double.parseDouble(jtxtScore[i].getText());
			weights[i] = Double.parseDouble(jtxtWeight[i].getText());
			numberGrade += scores[i] * weights[i];
		}
		return numberGrade;
	}
	/**
	 * method for displaying the weighted average test score
	 */
	public void actionPerformed(ActionEvent e) {
		jlblOutput.setText(String.valueOf(calculateAvgScore()));
	}
}