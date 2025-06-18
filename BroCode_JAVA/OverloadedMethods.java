
public class OverloadedMethods {

	public static void main(String[] args) {
		
		// overloaded methods = methods that share the same name but have different PARAMETERS
		//						method name + parameters = method signature
		
		
		int x = add(1, 2);
		
		System.out.println(x);
		
		int y = add(1, 2, 3);
		
		System.out.println(y);
		
		int z = add(1, 2, 3, 4);
		
		System.out.println(z);
		
		double j = add(1.5, 2.5, 3.5, 4.5);
		
		System.out.println(j);
		
	}
	
	static int add(int a, int b) {
		
		System.out.println("This is overload method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		
		System.out.println("This is overload method #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		
		System.out.println("This is overload method #3");
		return a + b + c + d;
	}
	
	// for double
	
	static double add(double a, double b) {
		
		System.out.println("This is overload method #4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		
		System.out.println("This is overload method #5");
		return a + b + c;
	}
	
	static double add(double a, double b, double c, double d) {
		
		System.out.println("This is overload method #6");
		return a + b + c + d;
	}
	
	
	}


