import java.util.Scanner;
public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		DynamicPolymorphismAnimal animal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose what animal you want to speak: ");
		System.out.print("(1 = dog) (2 = cat)");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new DynamicPolymorphismDog();
			animal.speak();
		}else if (choice == 2) {
			animal = new DynamicPolymorphismCat();
			animal.speak();
				
		}else {
			System.out.println("You chose the wrong number!");
			animal = new DynamicPolymorphismAnimal();
			
			animal.speak();
		}

	}

}

//Code for DynamicPolymorphismAnimal: 
/*

public class DynamicPolymorphismAnimal {
	
	public void speak() {
		System.out.println("The animal goes \"WTF DID YOU CHOOSE?!?\"");
	}

}

*/

//Code for DynamicPolymorphismDog: 
/*

public class DynamicPolymorphismDog extends DynamicPolymorphismAnimal{
	
	@Override
	public void speak() {
		System.out.println("The dog goes WOOF");
	}

}

*/

//Code for DynamicPolymorphismCat: 
/*

public class DynamicPolymorphismCat extends DynamicPolymorphismAnimal{
	
	@Override
	public void speak() {
		System.out.println("The cat goes MEOWOWOWOW");
	}

}

*/

