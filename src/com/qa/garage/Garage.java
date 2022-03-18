package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> garageList;

	// Adding vehicles to garage
	public void addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
	}

	// Get vehicle by id
	public Vehicle getVehicleById(int id) {
		// iterate over the list
		for (int i = 0; i < garageList.size(); i++) {
			// check if the current vehicle has the specified id
			// if so, return it
			Vehicle currentVehicle = garageList.get(i);
			int vehicleId = currentVehicle.getId();

			if (vehicleId == id) {
				return currentVehicle;
			}
		}
		return null;
	}

	// Removing vehicles from garage
	public void removeVehicle(Vehicle vehicle) {
		garageList.remove(vehicle);
	}

	// Removing vehicles by it's type
	public void removeVehicleByType() {
		for (int i = 0; i < garageList.size(); i++) {
			// unsure
		}
	}

	// Updating vehicles from garage
	public void updateVehicle(int index, Vehicle vehicle) {
		garageList.set(index, vehicle);
	}

	// Reading vehicle
	public Vehicle getVehicle(int index) {
		return garageList.get(index);
	}

	// Removing all vehicles from garage
	public void clearGarage() {
		garageList.clear();
	}

	// Running vehicle.fixVehicle() custom method
	public void fixVehicle(int index) {
		getVehicle(index).fixVehicle();
	}

	public Garage() {
		super();
		this.garageList = new ArrayList<>();
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Garage= ");
		builder.append(garageList);
		return builder.toString();
	}

}