package oopsday1.setgetconstructor;

public class Car {
	//properties - DATA MEMBERS-Instance-variables
	private String color;
	private double price;
	private String brand;
	private String model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car(String color, double price, String brand, String model) {
		
		this.color = color;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "i am a "+ brand;
	}
	

}
