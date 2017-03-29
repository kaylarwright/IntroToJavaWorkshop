package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If You Find Yourself Having To Cross A Piranha-Infested river, here's How to Do It...");
		// Get the user to enter an adjective
String Input = JOptionPane.showInputDialog("Enter An Adjective");

		// Get the user to enter a type of liquid
String Input2 = JOptionPane.showInputDialog("Enter A Type Of Liquid");

		// Get the user to enter a body part
String Input3 = JOptionPane.showInputDialog("Enter A Body Part");
		// Get the user to enter a verb
String Input4 = JOptionPane.showInputDialog("Enter A Verb");
		// Get the user to enter a place
String Input5 = JOptionPane.showInputDialog("Enter A Place");
		// Fit the user's words into this sentence, and save it in a String:
		String story = "Piranhas are more " + Input + " during the day, so cross the river at\n" +
		 "night. Piranhas are attracted to fresh " + Input2 + " and will most\n" +
		 "likely take a bite out of your " + Input3 + " if your " + Input4 + " .Whatever\n" +
		 "you do, if you have an open wound, try to find another way to get\n" +
		 "back to the " + Input5 + " .Good luck!";
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, story);

	}
}
