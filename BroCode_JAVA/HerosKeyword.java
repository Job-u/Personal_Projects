
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
