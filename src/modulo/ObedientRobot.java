package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot bot= new Robot();
	bot.penDown();
	bot.setSpeed(50);
	for(int i= 0; i<5;i++)
	bot.move(100);
	bot.turn(90);
	bot.move(100);
	bot.turn(90);
	bot.move(100);
	bot.turn(90);
	bot.move(100);
	bot.turn(90);
	
}
}
