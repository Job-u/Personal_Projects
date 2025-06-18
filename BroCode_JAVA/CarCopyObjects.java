
public class CarCopyObjects {

	private String model;
	private String make;
	private int year;
	
	CarCopyObjects(String model, String make, int year ){
		//if you are gonna use set you have to do this 
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		
		/*
		 * CarCopyObject(Car x){
		 * 		this.copy(x);
		 * 
		 */
	
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