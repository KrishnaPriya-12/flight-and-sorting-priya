package flight.set;

import java.util.Objects;

public class Flight implements Comparable<Flight>{
	private int flightId;
	private String carrierName;
	private String sourceAirport;
	private String destinationAirport;
	private float takeoffTime;
	private float landingTime;
	private String date;
	private int price;
	private float flightDuration;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int flightId, String carrierName, String sourceAirport, String destinationAirport, float takeoffTime,
			float landingTime, String date, int price, float flightDuration) {
		super();
		this.flightId = flightId;
		this.carrierName = carrierName;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.takeoffTime = takeoffTime;
		this.landingTime = landingTime;
		this.date = date;
		this.price = price;
		this.flightDuration = flightDuration;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public float getTakeoffTime() {
		return takeoffTime;
	}
	public void setTakeoffTime(float takeoffTime) {
		this.takeoffTime = takeoffTime;
	}
	public float getLandingTime() {
		return landingTime;
	}
	public void setLandingTime(float landingTime) {
		this.landingTime = landingTime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(float flightDuration) {
		this.flightDuration = flightDuration;
	}
	@Override
	public int hashCode() {
		return Objects.hash(carrierName, date, destinationAirport, flightDuration, flightId, landingTime, price,
				sourceAirport, takeoffTime);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(carrierName, other.carrierName) && Objects.equals(date, other.date)
				&& Objects.equals(destinationAirport, other.destinationAirport)
				&& Float.floatToIntBits(flightDuration) == Float.floatToIntBits(other.flightDuration)
				&& flightId == other.flightId
				&& Float.floatToIntBits(landingTime) == Float.floatToIntBits(other.landingTime) && price == other.price
				&& Objects.equals(sourceAirport, other.sourceAirport)
				&& Float.floatToIntBits(takeoffTime) == Float.floatToIntBits(other.takeoffTime);
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", carrierName=" + carrierName + ", sourceAirport=" + sourceAirport
				+ ", destinationAirport=" + destinationAirport + ", takeoffTime=" + takeoffTime + ", landingTime="
				+ landingTime + ", date=" + date + ", price=" + price + ", flightDuration=" + flightDuration + "]";
	}
	@Override
	public int compareTo(Flight obj) {
		// TODO Auto-generated method stub
		return this.getFlightId() - obj.getFlightId();
	}

}
