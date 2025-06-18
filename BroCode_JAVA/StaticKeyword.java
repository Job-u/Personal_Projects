
public class StaticKeyword {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//					  The class "owns" the static member
		//So anything that a class owns is shares one variable/method
		
		FriendStaticKeyword friends = new FriendStaticKeyword("Pochi");
		FriendStaticKeyword friends2 = new FriendStaticKeyword("Ronald");
		
		
		System.out.println(FriendStaticKeyword.numberOfFriends);
		FriendStaticKeyword.displayFriends();

	}

}

// Code for FriendStaticKeyword: 

/*

public class FriendStaticKeyword {

	String name;
	static int numberOfFriends;
	
	FriendStaticKeyword(String name){
		this.name = name;
		numberOfFriends++;
	}
		
	static void displayFriends() {
		System.out.println("You have: "+ numberOfFriends + " friends");
	}
}
*/