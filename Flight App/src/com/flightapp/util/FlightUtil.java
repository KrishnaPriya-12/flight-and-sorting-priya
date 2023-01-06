package com.flightapp.util;
import java.util.Random;

public class FlightUtil {
	public static int getRandomID()
	{
		Random random = new Random();
		
		int flightId = random.nextInt(5000);
		return flightId;
	}

}
