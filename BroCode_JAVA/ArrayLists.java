import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		//You need to use Wrapper Class such as "String" "Integer" "Double" etc..
		ArrayList<String> food = new ArrayList<String>();

		food.add("pizza");
		food.add("popcorn");
		food.add("hotdog");
		
		food.set(0, "ice cream"); //set method replaces value
		food.remove(2); //removes the value
		//food.clear(); //clears all list
		
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		}
	}

