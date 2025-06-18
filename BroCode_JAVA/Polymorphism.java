
public class Polymorphism {

	public static void main(String[] args) {
		// Polymorphism = The ability of an object to identify as more than one type
		
		PolymorphismCar car = new PolymorphismCar();
		PolymorphismBicycle bike = new PolymorphismBicycle();
		PolymorphismBoat boat = new PolymorphismBoat();
		
		//Create an array
		PolymorphismVehicle[] racers = {car, bike, boat};
		
		//create a for loop for the array
		for(PolymorphismVehicle x : racers) {
			x.go();
		}

	}

}

//Code for PolymorphismVehicle:

/*

public class PolymorphismVehicle {
	
	public void go(){
		
	}

}

*/

//Code for PolymorphismCar:

/*

public class PolymorphismCar extends PolymorphismVehicle{

	@Override
public void go(){
		System.out.println("The car begins moving");
	}

}

*/

//Code for PolymorphismBicycle:

/*

public class PolymorphismBicycle extends PolymorphismVehicle{

	@Override
	public void go(){
		System.out.println("The bicycle begins moving");
	}
}

*/

//Code for PolymorphismBoat:

/*

public class PolymorphismBoat extends PolymorphismVehicle {

	@Override
	public void go(){
		System.out.println("The boat begins moving");
	}
}

*/
