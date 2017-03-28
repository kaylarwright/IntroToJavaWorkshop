package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot Kayla = new Robot();

	Kayla.penDown();
	int sides = 4;
	for (int i = 0; i < sides; i++) {
	Kayla.setSpeed(50);
	Kayla.move(100);	
	Kayla.turn(360/sides);
	}
	
	}
}
