package Package2;
import Package1.*;
public class C {
	
	

	public 	  String publicMessage = "This is the public"; 		  //available and visible to all
	protected String protectedcMessage = "This is the protected"; //Only accessible as long as the Class has a sub class or uses extends
			  String defaultMessage = "This is the default";	  //available only to the package //Only accessible as long as the Class has a sub class or uses extends
	private   String privateMessage = "This is private";		  //Only visible to the class the it contain itself
}
