import java.util.ArrayList;
public class ForEachLoop {

	public static void main(String[] args) {
		
		//String[] animals = {"cat", "dog", "bird"};
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("dog");
		animals.add("rat");
		animals.add("cat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
			
		}
		
		}

	}


