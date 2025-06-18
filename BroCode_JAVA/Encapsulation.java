
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarEncapsulation car1 = new CarEncapsulation("Ferrari", "Scuderria", 2009);
		
		car1.setMake("Enzo");
		
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
	}

}

// Code for CarEncapsulation:

/*


public class CarEncapsulation {
	
	private String model;
	private String make;
	private int year;
	
	CarEncapsulation(String model, String make, int year ){
		//if you are gonna use the set you have to do "this.setMake(make)" instead "the this.make = make;"
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	
	}
	
	//if you need to retrieve use the get Method
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	
	//if you want to change or set the values use set Method
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

}


*/