
public class OverloadedConstructors {

	public static void main(String[] args) {
		// overloaded constructors = multiple constructors within a class with the same name,
		//							 but have a different parameters
		//							 name + parameters = signature
		
		PizzaOverloadedConstructor pizza1 = new PizzaOverloadedConstructor("thicc crust","tomato","mozzerella","pepperoni");
		
		System.out.println("Here are the ingredients of the pizza: ");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.toppings);
	}

}

// Code for PizzaOverloadedConstructor: 

/*
public class PizzaOverloadedConstructor {
	
	String bread;
	String sauce;
	String cheese;
	String toppings;
	
	PizzaOverloadedConstructor(String bread){
		this.bread = bread;
		
		
	}
	
	PizzaOverloadedConstructor(String bread, String sauce){
		this.bread = bread;
		this.sauce = sauce;
		
	}

	
	PizzaOverloadedConstructor(String bread, String sauce, String cheese){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		
	}

	PizzaOverloadedConstructor(String bread, String sauce, String cheese, String toppings ){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.toppings = toppings;
	}
}
*/