
public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int [3];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		//create an array of objects
		FoodArrayOfObjects[] refrigerator = new FoodArrayOfObjects[3];
		
		//Create an items
		FoodArrayOfObjects food1 = new FoodArrayOfObjects("Pizza");
		FoodArrayOfObjects food2 = new FoodArrayOfObjects("Hotdog");
		FoodArrayOfObjects food3 = new FoodArrayOfObjects("Rice");
		
		//put it in the array
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);

		/* another way is...
		 * 
		FoodArrayOfObjects food1 = new FoodArrayOfObjects("Pizza");
		FoodArrayOfObjects food2 = new FoodArrayOfObjects("Hotdog");
		FoodArrayOfObjects food3 = new FoodArrayOfObjects("Rice");
		
		Food[] refrigerator = {food1, food2, food3}
		
		//then print
		 */
	}

}

// Code for FoodArrayOfObjects: 
