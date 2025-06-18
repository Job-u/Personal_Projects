
public class InterfaceFish implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("*Fish is hunting a smaller fish*");
		
	}

	@Override
	public void flee() {
		System.out.println("*Fish is fleeing from a larger fish*");
		
	}

}
