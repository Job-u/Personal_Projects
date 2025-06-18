
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
