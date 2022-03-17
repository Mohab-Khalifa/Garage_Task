package com.qa.garage;

// Child Class
public class Helicopter extends Vehicle {

	// Fields
	private int numOfPropellers;
	private boolean chopper;

	// Method
	public void airbourne() {
		System.out.println("* chu chu chu chu*");
	}

	// Getters & Setters
	public int getNumOfPropellers() {
		return numOfPropellers;
	}

	public void setNumOfPropellers(int numOfPropellers) {
		this.numOfPropellers = numOfPropellers;
	}

	public boolean isChopper() {
		return chopper;
	}

	public void setChopper(boolean chopper) {
		this.chopper = chopper;
	}

	// Constructor
	public Helicopter(int id, String travelType, int numOfSeats, boolean electric, String colour, int maxSpeed,
			boolean damaged, int numOfPropellers, boolean chopper) {
		super(id, travelType, numOfSeats, electric, colour, maxSpeed, damaged);
		this.numOfPropellers = numOfPropellers;
		this.chopper = chopper;
	}

	// toString
	@Override
	public String toString() {
		return "Helicopter [numOfPropellers=" + numOfPropellers + ", chopper=" + chopper + "]";
	}

}
