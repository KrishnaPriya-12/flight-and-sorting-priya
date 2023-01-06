package sorting;

import java.util.Comparator;
import flight.set.Flight;

public class SortBasedOnPrice implements Comparator<Flight> {

	@Override
	public int compare(Flight p1, Flight p2) {
		// TODO Auto-generated method stub
		return p1.getPrice() - p2.getPrice();
	}
	

}
