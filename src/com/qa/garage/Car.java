package com.qa.garage;

public class Car extends Vehicle {

	// Fields
	private String make;
	private String model;
	private String bodyType;

	// Method
	@Override
	public void insertKey() {
		System.out.println("VROOM VROOM");
	}

	// Getters & Setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	// Constructor
	public Car(int id, String travelType, int numOfSeats, boolean electric, String colour, int maxSpeed,
			boolean damaged, String make, String model, String bodyType) {
		super(id, travelType, numOfSeats, electric, colour, maxSpeed, damaged);
		this.make = make;
		this.model = model;
		this.bodyType = bodyType;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", bodyType=" + bodyType + "]";
	}

}
