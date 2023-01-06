package sorting;

import java.util.Comparator;
import flight.set.Flight;

public class SortBasedOnCarrierName implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {
		
		return f1.getCarrierName().compareTo(f2.getCarrierName());
	}
	
	

}
