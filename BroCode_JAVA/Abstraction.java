
public class Abstraction {

	public static void main(String[] args) {
		
		// abstract = abstract classes cannot be instantiated, but they can have a subclass
		//			  abstract can be declared without an implementation
		
		//VehicleAbstraction vehicle = new VehicleAbstraction(); //this cannot be instantiated because of the abstract which can add more security //instead we need to pick a certain type of vehicle in order to work
		
		CarAbstraction car = new CarAbstraction();
		
		car.go();

	}

}

//Code for VehicleAbstraction:

/*

public abstract class VehicleAbstraction {
	
	abstract void go(); //it doesn't need a body

}

*/

//Code for CarAbstraction:

/*

public class CarAbstraction extends VehicleAbstraction {

	@Override
	 void go() {
		System.out.println("The car is moving");
	}

	}

*/