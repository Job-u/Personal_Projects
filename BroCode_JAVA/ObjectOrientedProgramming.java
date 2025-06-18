
public class ObjectOrientedProgramming {

	public static void main(String[] args) {
		
		//object = an instance of a class that may contain attributes and methods //basically a bundle of it and what are the characteristics of the object and what action that objects can perform
		//example: (phone, desk, computer, coffee cup)

		CarOOP myCar1 = new CarOOP();
		CarOOP myCar2 = new CarOOP();
		
		System.out.println(myCar1.model);
		System.out.println(myCar2.model);
		
		myCar1.drive();
		myCar1.brake();
		
	}

}


//inside the CarOOP class

/*
public class CarOOP {
	
	//attributes
	String make = "Chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;
	
	//methods
	void drive() {
		
		System.out.println("You are driving a car");
		
	}
	void brake() {
		
		System.out.println("You step on the breaks");
	}
}
*/