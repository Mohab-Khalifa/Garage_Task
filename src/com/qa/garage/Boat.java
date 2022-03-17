package com.qa.garage;

public class Boat extends Vehicle {

	// Fields
	private int length;
	private String typeOfBoat;
	private boolean nemoFound;

	// Method
	public void lookForNemo() {
		if (nemoFound == true) {
			System.out.println("Nemo has been found");
		} else {
			System.out.println("Just keep swimming!");
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getTypeOfBoat() {
		return typeOfBoat;
	}

	public void setTypeOfBoat(String typeOfBoat) {
		this.typeOfBoat = typeOfBoat;
	}

	public boolean isNemoFound() {
		return nemoFound;
	}

	public void setNemoFound(boolean nemoFound) {
		this.nemoFound = nemoFound;
	}

	// Constructor
	public Boat(int id, String travelType, int numOfSeats, boolean electric, String colour, int maxSpeed,
			boolean damaged, int length, String typeOfBoat, boolean nemoFound) {
		super(id, travelType, numOfSeats, electric, colour, maxSpeed, damaged);
		this.length = length;
		this.typeOfBoat = typeOfBoat;
		this.nemoFound = nemoFound;
	}

	// toString
	@Override
	public String toString() {
		return "Boat [length=" + length + ", typeOfBoat=" + typeOfBoat + ", nemoFound=" + nemoFound + "]";
	}

}
