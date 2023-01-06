package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


import flight.set.Flight;

public class FlightSorting {
	
	public static void main(String[] args) {
		Set<Flight> allFlights = new HashSet<>();
		
		Flight f1 = new Flight(101,"Indigo","Chennai","Delhi",11.2f,12.4f,"feb 20",5000,2.0f);
		Flight f2 = new Flight(102,"AirIndia","chennai","Hyderabad",12.2f,1.4f,"feb 10",2000,2.5f);
		Flight f3 = new Flight(103,"British","Tirupathi","Hyderabad",10.2f,11.4f,"feb 15",1000,1.5f);
		
		allFlights.add(f1);
		allFlights.add(f2);
		allFlights.add(f3);
		
		System.out.println("HashSet :- \n");
		for (Flight flight : allFlights) {
			System.out.println(flight);
	}
		Set<Flight> allSortedFlights = new TreeSet<>();
		allSortedFlights.addAll(allFlights);
		
		System.out.println("\n\nTreeSet :- \n");
		for (Flight flight : allSortedFlights) {
			System.out.println(flight);
		}
		
		//other sorting
		
		System.out.println("\n\n\nSort based on Carrier Name ");
		List<Flight> tempList1 = new ArrayList<>(allSortedFlights);
		
		SortBasedOnCarrierName sortedObj1 = new SortBasedOnCarrierName();
		Collections.sort(tempList1, sortedObj1);
		
		System.out.println("\n\n Sort Based on Price :- \n");
		for (Flight flight : tempList1) {
			System.out.println(flight);
		}
		
		System.out.println("\n\n\nSort based on Date ");
		List<Flight> tempList2 = new ArrayList<>(allSortedFlights);
		
		SortBasedOnDate sortedObj2 = new SortBasedOnDate();
		Collections.sort(tempList2, sortedObj2);
		
		
		
		System.out.println("Sort Flights based on Price ");
		List<Flight> tempList3 = new ArrayList<>(allSortedFlights);
		
		SortBasedOnPrice sortedObj = new SortBasedOnPrice();
		Collections.sort(tempList3, sortedObj);
		
		System.out.println("\n\n Sort Based on Price :- \n");
		for (Flight flight : tempList3) {
			System.out.println(flight);
		}
		

}
}	
