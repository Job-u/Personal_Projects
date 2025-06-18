import java.util.Scanner;
public class NestedLoops {

	public static void main(String[] args) {
		// nested loops = a loop inside a loop
		
		Scanner scanner = new Scanner(System.in);
		
		int rows; 		//in charge of outer loop
		int columns;	//in charge of inner loop
		String symbol = "";
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		System.out.println("Enter number of columns: ");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=0; i<=rows; i++) {
			System.out.println(); 
			for(int j=1; j<= columns; j++) {
				System.out.print(symbol);
			}
		}

	}

}
