package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
JOptionPane.showMessageDialog(null,"if you find yourself having to cross a piranha-infested river, here's how to do it.");
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
String adjective=JOptionPane.showInputDialog("Give me an adjective.");
		// Get the user to enter a type of liquid
String liquid=JOptionPane.showInputDialog("Give me a type of a liquid.");
		// Get the user to enter a body part
String bodyPart=JOptionPane.showInputDialog("Give me a name of a body part.");
		// Get the user to enter a verb
String verb=JOptionPane.showInputDialog("Give me an example of a verb.");
		// Get the user to enter a place
String place=JOptionPane.showInputDialog("Give me an example of a place.");
		// Fit the user's words into this sentence, and save it in a String:
String paragraph=
		" Piranhas are more "+adjective+" during the day, so cross the river at "
		 + " night. Piranhas are attracted to fresh "+liquid+"and will most "
		+ " likely take a bite out of your"+ bodyPart+" if you"+ verb+". Whatever "
		+ " you do, if you have an open wound, try to find another way to get"
		+ " back to the "+ place+". Good luck! ";
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
JOptionPane.showMessageDialog(null,"Bye");		

	}
}

