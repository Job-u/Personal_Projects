import javax.swing.JOptionPane;
public class GUIintro {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "Wassup "+ name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		JOptionPane.showMessageDialog(null, "Your age is: "+ age + " years old");
		
		double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter your grades: "));
		JOptionPane.showMessageDialog(null, "Your grade is: "+ grade);
				
	
	}

}
