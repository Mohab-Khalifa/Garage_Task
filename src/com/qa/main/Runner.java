package com.qa.main;

import com.qa.garage.Boat;
import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Helicopter;
import com.qa.garage.Vehicle;


//Garage Task

// The task is to create a garage class with methods for the following:
// - Adding Vehicles to garage 
// - Removing vehicles 
// - Updating vehicles
// - Reading vehicle
// - Removing all vehicles
// - Running vehicle.fixVehicle() custom method 


// Vehicles
// Vehicle should be a base class (parent) with at least 3 fields
// and a fixVehicle() method
//
// You should create at least 3 child classes extending off of Vehicle
// (car, bike, helicopter).
// Each child class should inherit the fields AND have 2 specific fields

public class Runner {
	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		System.out.println(garage);
		
		Vehicle car1 = new Car(1, "Land", 5, false, "Black", 150, false, "Vauxhall", "Astra", "Hatchback");
		garage.addVehicle(car1);
		car1.fixVehicle();
		
		Vehicle car2 = new Car(2, "Land", 5, false, "Black", 150, false, "Volkswagon", "Pasat", "Saloon");
		garage.addVehicle(car2);
		car2.fixVehicle();
		
		System.out.println(garage);
		
		Vehicle Heli1 = new Helicopter(3, "Air", 4, false, "Silver", 250, true, 3, false);
		garage.addVehicle(Heli1);
		Vehicle Heli2 = new Helicopter(4, "Air", 6, false, "Matt Black", 300, false, 4, true);
		garage.addVehicle(Heli2);
		Vehicle Boat1 = new Boat(5, "Water", 6, false, "Eggshell White", 100, true, 30, "Fishing Boat", true);
		garage.addVehicle(Boat1);
		
		System.out.println(garage.getVehicle(1));
		
		
		System.out.println(garage);
		
		garage.clearGarage();
		
		System.out.println(garage);
	}

}
