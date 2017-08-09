package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot myjavaRobot=new Robot();

	

	void go() {
		// 4. Make the robot move as fast as possible
myjavaRobot.setSpeed(10);
		// 5. Set the pen width to 5
myjavaRobot.penDown();
		// 6. Do steps #7 to #8 four times...
for(int i=0; i<4; i++){


			// 7. Set the pen color to random
myjavaRobot.setRandomPenColor();	
			// 1. Call the drawSquare() method
drawSquare();	
			// 8. Turn the robot 90 degrees to the right
myjavaRobot.turn(90);
	}
	}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
for(int i=0; i<4; i++)	{	
myjavaRobot.move(200);		
myjavaRobot.turn(90);
}


	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
