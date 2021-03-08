package arrays;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.

Robot[] robs = new Robot[10];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robs.length; i++) {
	robs[i] = new Robot();
	robs[i].setX(50 + i * 100);
	robs[i].setY(550);
	robs[i].setSpeed(15);
}

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random rand = new Random();
boolean finish = false;
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
while(finish != true){
	for (int i = 0; i < robs.length; i++) {
		int turn = rand.nextInt(5) +1;
		for (int j = 0; j < turn; j++) {		
				robs[i].turn(+5);
				robs[i].move(5);
				if (robs[i].getX() == 50 + i * 100 && robs[i].getY() == 550) {
					finish = true;
					JOptionPane.showMessageDialog(null, "Congraulations robot " + i + "! You are the winner!");
					System.exit(0);;
				}
		} 
		
		
	}
}

}
	//7. declare that robot the winner and throw it a party!


	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}

