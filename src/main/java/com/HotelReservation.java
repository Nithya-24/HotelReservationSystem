package com;

import java.util.*;

public class HotelReservation {
		
	String hotelName;
	int rating;
	double regularCustomerRate;
	double weekendRegularCustomerRate;
	Scanner sc = new Scanner(System.in);
	
	ArrayList<ReservationSystem> hotelList = new ArrayList<ReservationSystem>();
	ReservationSystem reservationSystem = new ReservationSystem(hotelName, rating, regularCustomerRate, weekendRegularCustomerRate);
	
	
	public boolean addHotel() {

		System.out.println("Enter hotel name:");
		hotelName = sc.next();
		System.out.println("Enter hotel rating:");
		rating = sc.nextInt();
		System.out.println("Enter regular customer rate:");
		regularCustomerRate = sc.nextDouble();
		System.out.println("Enter Weekend regular customer rate:");
		weekendRegularCustomerRate = sc.nextDouble();
		return hotelList.add(reservationSystem);
	}

	/**
	 * Method to Print ArrayList hotelList
	 */
	public void printHotelList() {
		System.out.println(hotelList);
	}
		
	    
	   
}
