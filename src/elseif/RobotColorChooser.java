
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot bot= new Robot();
		//3. ask the user what color they would like the robot to draw
		String answer = JOptionPane.showInputDialog("What color would you like to draw");
		//4. use an if/else statement to set the pen color that the user requested
		if(answer.equals("red")) {
			bot.setPenColor(255, 0, 0);
		
		
		}	
		else if(answer.equals("green")) {
			bot.setPenColor(0, 255, 0);
		
		
		
		
		}

        //5. if the user doesn’t enter anything, choose a random color
				bot.setPenColor(0,0,255);
				
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		bot.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
			

		
					
					bot.setSpeed(20);
					bot.penDown();
					for(int i=0;i<4;i++) {
					bot.move(100);
					bot.turn(90);
					
					}	
				
				
	}			
}
