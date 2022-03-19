package com;

public class ReservationSystem {
	
	/**
	 * hotelName for Name of the Hotel
	 * Rating for Rate of Hotel
	 * Customer Rating 
	 */
	String hotelName;
	int rating;
	double regularCustomerRate;
	double weekendRegularCustomerRate;
	
	public ReservationSystem(String hotelName, int rating, double regularCustomerRate, double weekendRegularCustomerRate) {
		this.hotelName = hotelName;
		this.rating = rating;
		this.regularCustomerRate = regularCustomerRate;
		this.weekendRegularCustomerRate = weekendRegularCustomerRate;
	}
	
	/**
	 * getting and setting Names of Hotel and Rate and to set to corresponding names
	 * @return
	 */
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRate() {
		return rating;
	}

	public void setRate(int rate) {
		this.rating = rate;
	}

	public double getRegularCustomerRate() {
		return regularCustomerRate;
	}

	public void setRegularCustomerRate(double regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}
	
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", regularCustomerRate=" + regularCustomerRate
				+ ", weekendRegularCustomerRate=" + weekendRegularCustomerRate +"]";
	}

}
