package day3;

import org.jointheleague.graphical.robot.Robot;

public class Myfirstjavaprogam {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();

		r2d2.penDown();
		r2d2.setPenColor(255, 255, 255);

		for (int i = 0; i < 4; i++) {
			r2d2.move(246);
			r2d2.turn(90);
			r2d2.setSpeed(5);
			r2d2.move(50);
			r2d2.turn(80);
			r2d2.turn(90);
			r2d2.move(125);
			r2d2.sparkle();

		}
	}
}