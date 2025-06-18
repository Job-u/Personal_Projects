import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";

		
		// do loop is a variation of while loop
		
		do{
			System.out.print("Enter your fking name: ");
			name = scanner.nextLine(); 
		}while (name.isBlank());
		
			System.out.println("Hello "+ name + "!");
			
		}

	}


		
		/*
		while(name.isBlank()) {
			System.out.print("Enter your fking name: ");
			name = scanner.nextLine(); 
		}{
			System.out.println("Hello "+ name + "!");
		}
		*/
