
package Package2;

import Package1.*;

public class Asub extends A{
	
	public static void main(String[] args) {


		C c = new C();
		
		System.out.println(c.publicMessage); //accessible to all
		
		Asub asub = new Asub();
		
		System.out.println(asub.protectedcMessage); //Only accessible as long as the Class has a sub class or uses extends

	}

}
