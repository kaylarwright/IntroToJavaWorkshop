package day3;

import javax.swing.JOptionPane;
public class MadLibs2 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You are at the beach about to surf the biggest wave ever");
		String name = JOptionPane.showInputDialog("Best friends Name");
		String place = JOptionPane.showInputDialog("Place");
		String adjective = JOptionPane.showInputDialog("Adjective");
		String adjective2 = JOptionPane.showInputDialog("Adjective");
		String object = JOptionPane.showInputDialog("Object");
		String adjective3 = JOptionPane.showInputDialog("Adjective");
		String color = JOptionPane.showInputDialog("Color");
		String adjective4 = JOptionPane.showInputDialog("Adjective");
		String emotion  = JOptionPane.showInputDialog("Emotion");
		String time = JOptionPane.showInputDialog("Time");
		String adjective5 = JOptionPane.showInputDialog("Adjective");
		
		JOptionPane.showMessageDialog(null, "You and your friend " + name + " are going to a beach in " + place + ". \n" +
		"You are " + adjective + " to go. At the same time you are scurred because your mom said there would be \n " 
		+ adjective2 + " sharks. When you get to the beach it is full of " + object + " . You get on top of you \n "
		+ adjective3 + " " + color + " surfboard. You see a " + adjective4 + " wave ahead of you. You take a deep \n " +
		" breath as the wave carries you away. You feel so " + emotion + " and wish to do this every " + time + " . This \n"
		+ "was the most" + adjective5 + "expience ever.");
	
	
	
	}
	}

