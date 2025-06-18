import java.util.*;
public class ArrayLists2D {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		
		bakeryList.add("Pasta");
		bakeryList.add("Garlic bread");
		bakeryList.add("Donuts");
		
		//if you want to retrieve a certain value use .get
		//System.out.println(bakeryList.get(0));
		
ArrayList<String> produceList = new ArrayList<String>();
		
		produceList.add("Tomatoes");
		produceList.add("Zucchini");
		produceList.add("Peppers");
		
ArrayList<String> drinks = new ArrayList<String>();
		
		drinks.add("Water");
		drinks.add("Sprite");
		drinks.add("Royal");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinks);
		
		System.out.println(groceryList.get(2).get(1));
		

		

	}

}
