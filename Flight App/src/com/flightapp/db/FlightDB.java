package com.flightapp.db;
import java.util.ArrayList;
import java.util.List;

import com.flightapp.entity.Flight;
import com.flightapp.util.FlightUtil;


public class FlightDB {
List<Flight> allFlights = new ArrayList<>();
	
	
	public List<Flight> getAllFlight()
	{
		return allFlights;
	}
	public List<Flight> getAllProductByCarrierName(String searchCarrier)
	{
		
		
		List<Flight> outputFlights = new ArrayList<>();
		
		for (Flight flight : allFlights) {
			if(flight.getCarrierName().equalsIgnoreCase(searchCarrier))
			{
				outputFlights.add(flight);
			}
		}
		
		return outputFlights;
	}
	
	
	
	
	
	public Flight saveFlightInDB(Flight flight)
	{
		if(flight != null)
		{
			flight.setFlightId(FlightUtil.getRandomID());
			boolean status =  allFlights.add(flight);
			if(status) return flight;
			else return null;
			
		}
		else
		{
			return null;
		}
		
	}
	
	public List<Flight> getAllFlightBetweenSourceAndDestion(String source, String destination) {
         List<Flight> outputFlights = new ArrayList<>();
		
		for (Flight flight : allFlights) {
			if(flight.getSourceAirport().equalsIgnoreCase(source)&& flight.getDestinationAirport().equalsIgnoreCase(destination) )
			{
				outputFlights.add(flight);
			}
		}
		
		return outputFlights;
		
	}
	public List<Flight> getAllFlightBetweenSourceAndDestinationWithPrice(String source, String destination, int price) {
       List<Flight> outputFlights = new ArrayList<>();
		
		for (Flight flight : allFlights) {
			if(flight.getSourceAirport().equalsIgnoreCase(source)&& flight.getDestinationAirport().equalsIgnoreCase(destination) && flight.getPrice()== price)
			{
				outputFlights.add(flight);
			}
		}
		
		return outputFlights;
		
	}
	public List<Flight> getAllFlightBetweenSourceAndDestinationWithDate(String source, String destination,
			String date) {
         List<Flight> outputFlights = new ArrayList<>();
		
		for (Flight flight : allFlights) {
			if(flight.getSourceAirport().equalsIgnoreCase(source)&& flight.getDestinationAirport().equalsIgnoreCase(destination) && flight.getDate().equalsIgnoreCase(date)   )
			{
				outputFlights.add(flight);
			}
		}
		
		return outputFlights;
		
	}

}
