
public class Arrays2D {

	public static void main(String[] args) {
		
		String[][] cars = {	{"Camero","Corvette","Mustang"},
							{"Ferrari","Tesla","Honda"},
							{"Toyota,","Lambo","Buggati"}
						};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				
			}
		}
	}
}
	

		/*
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camero";
		cars[0][1] = "Corvette";
		cars[0][2] = "Mustang";
		cars[1][0] = "Ferrari";
		cars[1][1] = "Tesla";
		cars[1][2] = "Honda";
		cars[2][0] = "Toyota";
		cars[2][1] = "Lambo";
		cars[2][2] = "Buggati";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	}

}
*/