import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		
		System.out.println("Hello\s" + name);
		
		System.out.println("How old are you? " );
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("You are\s" + age + " years old");
		
		System.out.println("What is your fav fruit? ");
		String fruit = scanner.nextLine();
		
		System.out.println("Your favorite fruit is "+ fruit);
		
		scanner.close();
				
	}
	}


