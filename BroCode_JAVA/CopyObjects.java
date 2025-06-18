
public class CopyObjects {

	public static void main(String[] args) {

		CarCopyObjects car1 = new CarCopyObjects("Ferrari", "Scuderria", 2009);
		CarCopyObjects car2 = new CarCopyObjects("Ferrari", "Enzo", 2010);
		
		//or CarCopyObject car2 = newCarCopyObject(car1); to instantiate
		
		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
	}

}

// Code for CarCopyObject:

/*
public class CarCopyObjects {

	private String model;
	private String make;
	private int year;
	
	CarCopyObjects(String model, String make, int year ){
		//if you are gonna use set you have to do this 
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		
		
		  //CarCopyObject(Car x){
		  //		this.copy(x);
		
	
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
	
public void copy(CarCopyObjects x) {
		this.setMake(x.make);
		this.setModel(x.model);
		this.setYear(x.year);
	}

}
*/
