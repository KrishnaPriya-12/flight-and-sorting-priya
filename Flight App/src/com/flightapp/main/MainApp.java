package com.flightapp.main;
import java.util.List;
import java.util.Scanner;

import com.flightapp.controller.FlightController;
import com.flightapp.entity.Flight;

public class MainApp {
	Scanner sc = new Scanner(System.in);
	FlightController server = new FlightController();
	
	public static void main(String[] args) {
		
		MainApp app = new MainApp();
		
		while(true)
		{
			System.out.println("\n\n-------- Flight App Menu ----------");
			System.out.println("1. Insert Flight");
			System.out.println("2. Display All Flights");
			System.out.println("3.Flights by Carrier Name");
			System.out.println("4.All Flights Between Source & Destination Airport");
			System.out.println("5.All Flights Between Source & Destination with Price filter");
			System.out.println("6.All Flights Between Source & Destination Airport & Date");
			
			System.out.println("---- Enter Choice----");
			int choice = Integer.parseInt(app.sc.nextLine());
			
			switch (choice) {
			case 1:
				app.takeUserInputForFlight();
				break;
			
			case 2:
				app.displayAllFlights();
				break;
				
				
			case 3:
				app.getFlightsByCarrierName();
				break;
			
			case 4:
				app.getFlightsBetweenSourceAndDestination();
				break;
				
			case 5:
				app.getFlightsBetweenSourceAndDestinationWithPrice();
				break;
				
			case 6:
				app.getFlightsBetweenSourceAndDestinationWithDate();
				break;	
				
			
			
			case 0:
				System.exit(0);
				break;
			


			default:
				break;
		}//end of switch
		}
	}
	
	public void displayAllFlights() {
		List<Flight> allFlights = server.getAllFlights();
		
		System.out.println("\n\n ----All Saved Flightss---");
		
		for (Flight flight : allFlights) {
			displayFlights(flight, "");
		}
		
	}
	public void takeUserInputForFlight()
	{
		try {
			System.out.println("\n\t Enter Flight Details \n");
			System.out.println("\n Enter Flight Carrier ");
			String carrierName = sc.nextLine();
			
			//System.out.println("\n Enter Carrier Name ");
			//String carrierName = sc.nextLine();
			
			System.out.println("\n Enter SourceAirport ");
			String sourceAirport = sc.nextLine();
			
			System.out.println("\n Enter DestinationAirport ");
			String destinationAirport = sc.nextLine();
				
			System.out.println("\n Enter Takeoff Time");
			float takeoffTime = Float.parseFloat(sc.nextLine());
			
			System.out.println("\n Enter Landing Time");
			float landingTime = Float.parseFloat(sc.nextLine());
			
			System.out.println("\n Enter Date ");
			String date = sc.nextLine();
			
			System.out.println("\n Enter Cost");
			int cost = Integer.parseInt(sc.nextLine());
			
			System.out.println("\n Enter Flight Duration");
			float flightDuration = Float.parseFloat(sc.nextLine());
			
			// NOTE : id will be auto generated ...
			
			Flight userInputFlight = new Flight(0,carrierName,sourceAirport,destinationAirport, takeoffTime, landingTime, date, cost, flightDuration);
			// Now click the submit button
			Flight serverSavedFlight = server.insertFlight(userInputFlight);
			
			if(serverSavedFlight != null)
				displayFlights(serverSavedFlight,"Flight Inserted !!!");
			else
				displayErrors("Flight Not Saved , Try again or check Authority ");
			
		}
		catch (Exception e) {
			displayErrors(" Wrong Input , Enter Again");
			takeUserInputForFlight();
		}
	
	}
	
	public void displayErrors(String errorMsg)
	{
		System.out.println("_______ !!! Error !!! _________________________");
		System.out.println(errorMsg);
	}
	public void displayFlights(Flight f,String tagline)
	{
		System.out.println(tagline);
		System.out.println(f.getFlightId()+" - "+f.getCarrierName()+" - "+f.getSourceAirport()+" - "+f.getDestinationAirport()+" - "+f.getTakeoffTime()+" - "+f.getLandingTime()+" - "+f.getDate()+" - "+f.getPrice()+" - "+f.getFlightDuration());
	}
	public void getFlightsByCarrierName()
	{
		
		System.out.println("\n Enter Search Flight Carrier Name ");
		String carrier = sc.nextLine();
		
		List<Flight> outputData = server.getFlightsByCarrierName(carrier);
		System.out.println(" -------- ALL  "+carrier+" --------------");
		for (Flight flight : outputData) {
			displayFlights(flight, "");
		}
	}
	
	public void getFlightsBetweenSourceAndDestination ()
	{
		System.out.println("\n Enter Source Airport ");
		String source = sc.nextLine();
		
		System.out.println("\n Enter Destination Airport  ");
		String destination = sc.nextLine();
		
		
		
	
		
		List<Flight> outputData = server.getFlightsBetweenSourceAndDestination(source, destination);
		System.out.println(" -------- ALL  "+source+destination+" --------------");
		for (Flight flight : outputData) {
			displayFlights(flight, "");
		}
	}
	public void getFlightsBetweenSourceAndDestinationWithPrice ()
	{
		System.out.println("\n Enter Source Airport ");
		String source = sc.nextLine();
		
		System.out.println("\n Enter Destination Airport  ");
		String destination = sc.nextLine();
		
		System.out.println("\n Enter Search Price  ");
		int price = Integer.parseInt(sc.nextLine());
		
		
		
	
		
		List<Flight> outputData = server.getFlightsBetweenSourceAndDestinationWithPrice(source, destination,price);
		System.out.println(" -------- ALL  "+source+destination+price+" --------------");
		for (Flight flight : outputData) {
			displayFlights(flight, "");
		}
	}
	public void getFlightsBetweenSourceAndDestinationWithDate ()
	{
		System.out.println("\n Enter Source Airport ");
		String source = sc.nextLine();
		
		System.out.println("\n Enter Destination Airport  ");
		String destination = sc.nextLine();
		
		System.out.println("\n Enter Search Date  ");
		String date = sc.nextLine();
		
		
		
	
		
		List<Flight> outputData = server.getFlightsBetweenSourceAndDestinationWithDate(source, destination,date);
		System.out.println(" -------- ALL  "+source+destination+date+" --------------");
		for (Flight flight : outputData) {
			displayFlights(flight, "");
		}
	}
	

}
