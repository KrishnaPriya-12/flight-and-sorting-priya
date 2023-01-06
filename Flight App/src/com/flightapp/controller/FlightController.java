package com.flightapp.controller;
import java.util.List;

import com.flightapp.db.FlightDB;
import com.flightapp.entity.Flight;

public class FlightController {
FlightDB db ;
	
	public FlightController() {
		db = new FlightDB();
	}
	
	public List<Flight> getAllFlights()
	{
		return db.getAllFlight();
	}
	
	public Flight insertFlight(Flight userInputflight)
	{
		// validate property values
		// security 
		Flight savedFlight = db.saveFlightInDB(userInputflight);
		return savedFlight;
		
	}

	public List<Flight> getFlightsByCarrierName(String carrier) {
		
		return db.getAllProductByCarrierName(carrier);
	}

	public List<Flight> getFlightsBetweenSourceAndDestination(String source, String destination) {

		return db.getAllFlightBetweenSourceAndDestion(source,destination);
	}

	public List<Flight> getFlightsBetweenSourceAndDestinationWithPrice(String source, String destination, int price) {
		
		return db.getAllFlightBetweenSourceAndDestinationWithPrice(source,destination,price);
	}

	public List<Flight> getFlightsBetweenSourceAndDestinationWithDate(String source, String destination, String date) {
		
		return db.getAllFlightBetweenSourceAndDestinationWithDate(source,destination,date);
	}

}
