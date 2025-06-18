import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
		
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
		
			System.out.println("Enter a whole number to divide by: " );
			int y = scanner.nextInt();
		
			int z = x/y;
		
			System.out.println("Result: "+ z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero dumbass! idiot! no life! kys!");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a number dumbass! idiot! no life! kys!");
		}
		catch(Exception e) { // using catch(Exception e) catches all the exceptions
			System.out.println("Wrong input idiot!");
		}
		finally {
			System.out.println("It will always print even with exception");
			scanner.close(); //also good for closing scanners or files
			
		}
	}

}
