
public class MethodOverriding {

	public static void main(String[] args) {
		
		AnimalOverriding animal = new AnimalOverriding();
		
		animal.speak();
		
		DogOverriding dog = new DogOverriding();

		dog.speak();
		
	}

}

// Code for AnimalOverriding: 

/*

public class AnimalOverriding {

	void speak() {
		System.out.println("The animal is speaking! ");
	}
}

*/

//Code for DogOverriding: 

/*

public class DogOverriding extends AnimalOverriding {

	@Override
	void speak() {
		System.out.println("The dog is barking! ");
	}
}


*/