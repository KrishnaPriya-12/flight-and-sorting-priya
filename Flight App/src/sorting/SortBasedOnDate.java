package sorting;

import java.util.Comparator;
import flight.set.Flight;


public class SortBasedOnDate implements Comparator<Flight> {

	@Override
	public int compare(Flight d1, Flight d2) {
		// TODO Auto-generated method stub
		return d1.getDate().compareTo(d2.getDate());
	}
	

}
