package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.

Robot[] robs = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robs.length; i++) {
	robs[i] = new Robot();
}
robs[0].setX(50);
robs[0].setY(550);
robs[1].setX(250);
robs[1].setY(550);
robs[2].setX(450);
robs[2].setY(550);
robs[3].setX(650);
robs[3].setY(550);
robs[4].setX(850);
robs[4].setY(550);
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random rand = new Random();
boolean finish = false;

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
while(finish != true){
	for (int i = 0; i < robs.length; i++) {
		robs[i].move(rand.nextInt(50));
		if (robs[i].getY() < -20) {
			finish = true;
		}
	}
}

}
	//7. declare that robot the winner and throw it a party!


	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}

