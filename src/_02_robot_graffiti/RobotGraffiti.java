package _02_robot_graffiti;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot bob = new Robot ("batman");
	bob.penDown(); bob.setSpeed(1000);
	bob.setPenColor(Color.CYAN);
	bob.move(200);
	bob.turn(180);
	bob.move(100);
	bob.turn(-90);
	bob.move(50);
	bob.turn(90);
	bob.move(100);
	bob.turn(180);
	bob.move(200);
	
}
}
