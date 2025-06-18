
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
