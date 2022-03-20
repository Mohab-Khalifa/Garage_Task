package com.qa.garage;

//Parent Class
public class Vehicle {

	// Fields
	private int id;
	private String travelType;
	private int numOfSeats;
	private boolean electric;
	private String colour;
	private int maxSpeed;
	private boolean damaged;

	// Methods
	public void insertKey() {
		System.out.println("Systems ON!");
	}

	public void fixVehicle() {
		if (this.damaged == true) {
			System.out.println("Fix vehicle");
		} else {
			System.out.println("Customize Vehicle");
		}
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTravelType() {
		return travelType;
	}

	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isDamaged() {
		return damaged;
	}

	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}

	// Constructors
	public Vehicle(int id, String travelType, int numOfSeats, boolean electric, String colour, int maxSpeed,
			boolean damaged) {
		super();
		this.id = id;
		this.travelType = travelType;
		this.numOfSeats = numOfSeats;
		this.electric = electric;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
		this.damaged = damaged;
	}

	public Vehicle() {
		super();
	}

	// ToString
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", travelType=" + travelType + ", numOfSeats=" + numOfSeats + ", electric="
				+ electric + ", colour=" + colour + ", maxSpeed=" + maxSpeed + ", damaged=" + damaged + "]";
	}

}
