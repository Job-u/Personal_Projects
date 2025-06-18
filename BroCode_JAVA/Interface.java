
public class Interface {

	public static void main(String[] args) {
		
		// Interface = similar to inheritance(extends) but can put multiple classes
		// instead of extends it uses implements
		
		InterfaceRabbit rabbit = new InterfaceRabbit();
		InterfaceHawk hawk = new InterfaceHawk();
		InterfaceFish fish = new InterfaceFish();
		
		rabbit.flee();
		hawk.hunt();
		
		fish.flee();
		fish.hunt();

	}

}

//Code for InterfacePrey:

/*
 
public interface Prey {
	
public void flee();
	

}

*/

//Code for InterfacePredator:

/*

public interface Predator {
	
	public void hunt();

}

*/


//Code for InterfaceRabbit: 

/*

public class InterfaceRabbit implements Prey {

	@Override
	public void flee() {
		System.out.println("*Rabbit is fleeing");
		
	}

	
}

*/

//Code for InterfaceHawk:

/*

public class InterfaceHawk implements Predator{

	@Override
	public void hunt() {
		System.out.println("*Hawk is hunting");
		
	}

}

*/

//Code for InterfaceFish:

/*

public class InterfaceFish implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("*Fish is hunting a smaller fish*");
		
	}

	@Override
	public void flee() {
		System.out.println("*Fish is fleeing from a larger fish*");
		
	}

}

*/

