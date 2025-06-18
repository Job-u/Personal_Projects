
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
