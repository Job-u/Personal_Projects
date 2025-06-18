
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleInheritance vehicle = new VehicleInheritance();
		
		vehicle.go();
		vehicle.stop();
		
		CarInheritance car = new CarInheritance();
		
		System.out.println(car.door);
		System.out.println(car.wheels);
		
		BicycleInheritance bike = new BicycleInheritance();
		
		System.out.println(bike.pedals);
		System.out.println(bike.wheels);

	}

}

//Code for VehicleInheritance: 

/*

public class VehicleInheritance {
	
	double speed;
	
	void go() {
		
		System.out.println("The vehicle is moving!");
	}
	
	void stop(){
		
		System.out.println("The vehicle has stopped!");
	}

}

*/

//Code for CarInheritance: 

/*

public class CarInheritance extends VehicleInheritance {
	
	int door = 4;
	int wheels = 4;

}

*/

//Code for BicycleInheritance: 

/*

public class BicycleInheritance extends VehicleInheritance {
	
	int pedals = 2;
	int wheels = 2;

}

*/