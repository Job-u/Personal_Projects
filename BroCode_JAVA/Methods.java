
public class Methods {

	public static void main(String[] args) {
		// methods = a block of code that is executed whenever it is called upon

		//examples for return type
		
		
		int x = 5;
		int y = 5;
		
		
		int z = add(x,y); //declaring z twice because it only recognize inside the local variable to execute
		
		System.out.println(z);
		//OR
		System.out.println(add(x,y));
		
	}
	
	static int add(int x, int y) { //int means it expects that there will be a return value so thats why there is a return type
		
		int z = x + y;
		
	return z; //to return the value of z to the main method
	}
}

		
/*
		String name = "Job";
		int age = 21;
		hello(name, age);

	}
	
	static void hello(String name,int age) { //needs a matching parameter or inside () to call the method
		System.out.println("Hello" + name);// if you want to put the data type *name* you need to declare the parameters first
		System.out.println("You are "+ age);
		
	}
	}
*/

