
public class Constructors {

	public static void main(String[] args) {
		
		//constructor = special method that is called when an object is instantiated ( created )
		
		HumanConstructor human1 = new HumanConstructor("Job", 20, 70);
		HumanConstructor human2 = new HumanConstructor("Isabel", 13, 35);
		
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human1.study();
		human2.play(); 
		

	}

}

//inside HumanConstructor class

/*
public class HumanConstructor {
	
	String name;
	int age;
	double weight;
	
	
	//To create a constructor in a class: 
	HumanConstructor(String name, int age, double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void study() {
		System.out.println(this.name+" is studying");
	}
	void play() {
		System.out.println(this.name+" is playing");
	}

}
*/
