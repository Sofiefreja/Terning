package terning;
// Klassen # Jonas
import java.util.Random;
public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		Random dice = new Random(); //initialize the Random object "dice"
		int res = dice.nextInt(6); //get a random integer between 1-6
		return res; //return statement
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
