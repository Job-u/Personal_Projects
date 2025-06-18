
public class PrintF {

	public static void main(String[] args) {
		
		System.out.printf("This is a format string %d", 123); //% use for format specifier -- just like a secret code
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Job";
		int myInt = 50;
		double myDouble = 3000;
		
		//convertion character
		System.out.printf("%b", myBoolean);
		System.out.printf("%c", myChar);
		System.out.printf("%s", myString);
		System.out.printf("%d", myInt);
		System.out.printf("%f", myDouble);
		
		/*
		 *  %b = boolean
		 *  %c = char
		 *  %s = String
		 *  %d = decimal or numbers
		 *  %f = double or float value 
		 */
		
		//width
		System.out.printf("Hello %10s", myString); //puts 10 spaces
		
		//precision
		
		System.out.printf("You have this much money %.2f", myDouble); //Can limit ammount of digit
		
		//flags
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		System.out.printf("You have this much money %+f", myDouble);

	}

}
