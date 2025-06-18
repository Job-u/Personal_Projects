import java.util.Random;

public class VariableScope {

	public static void main(String[] args) {
		
		//local = declared INSIDE a method
		//		  visible only to that method
		
		//global = declared OUTSIDE a method, but WITHIN a class
		//		  visible to all parts of a class
		
		DiceRollerVariableScope diceRoller = new DiceRollerVariableScope();
		
	}

}

//inside DiceRollerVariableScope code:

/*
import java.util.Random;
public class DiceRollerVariableScope {
	
	//to declare it as a global variable you need to put it OUTSIDE the constructor but it is INSIDE the class
	//Random random;
	//int number;
	
	DiceRollerVariableScope(){
		
		//they are local because it is only visible inside this constructor
		Random random = new Random();
		int number = 0;
		roll(random, number); // to access for the roll method to work you can pass this as arguments from roll() to roll(random, number)
		
	}
	
	void roll(Random random, int number) { //after setting up the arguments above you need to put the parameters from roll() to roll(Random random, int number)
		number = random.nextInt(6)+1;
		System.out.println(number);
	}

}
*/