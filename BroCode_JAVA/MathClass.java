import java.util.Scanner;
public class MathClass {

	public static void main(String[] args) {
		
		// Solving for hypotenuse
		
		double x;
		double y;
		double z;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input side x: ");
		x = scan.nextDouble();
		
		System.out.println("Input side y: ");
		y = scan.nextDouble();
		
		
		// Right angled triangle formula
		z = Math.sqrt((x*x + y*y));
		
		System.out.println("The hypotenuse is: "+ z);
		
		scan.close();
		
		
		/*
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); //Gets the largest num
		
		System.out.println(z);
		*/
		
		/*
		 * if looking for Lowest use Math.min
		 * if Math.sqrt it gets the square root value
		 * if Math.abs it displays the absolute value
		 * if Math.ceil it rounds UP the value
		 * if Math.floor it rounds DOWN the value
		 */
		


	}

}
