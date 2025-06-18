 
public class ObjectPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GarageObjectPassing garage = new GarageObjectPassing();
		
		CarObjectPassing car = new CarObjectPassing("Ferrari");
		CarObjectPassing car2 = new CarObjectPassing("Tesla");
		
		garage.park(car);
		garage.park(car2);

	}

}

// Code for GarageObjectPassing: 

/*
public class GarageObjectPassing {

	
void park(CarObjectPassing myCars) { //To pass the car you need to type the class name in the parameter
	System.out.println("You have park your " + myCars.name );
}
}
*/

//Code for CarObjectPassing: 

/*
public class CarObjectPassing {

	String name;
	
	CarObjectPassing(String name){
		
		this.name = name;
	}
}
*/