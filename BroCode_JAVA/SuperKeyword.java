
public class SuperKeyword {

	public static void main(String[] args) {
		
		// super is similar to this but when you use super only when you need to take from a super class to subclass

		HerosKeyword hero1 = new HerosKeyword("Batman",40,"Rich");
		HerosKeyword hero2 = new HerosKeyword("Superman",45,"Laser");
		
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.powers);
		System.out.println();
		System.out.println(hero2.toString());
	}

}

// Code for PersonSuperKeyword:

/*
 
public class PersonSuperKeyword {

	String name;
	int age;
	
	PersonSuperKeyword(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name+"\n"+this.age+"\n";
	}
}

 */

//Code for HerosKeyword:

/*

public class HerosKeyword extends PersonSuperKeyword{

	String powers;
	
	HerosKeyword(String name, int age, String powers) {
		super(name, age);
		this.powers = powers;
		
	}
	
	public String toString() {
		return super.toString()+powers;
	}
	
}

*/
