package com;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 * This is a main class.
 * In this we are adding and displaying the hotel details.
 *
 */
public class Main {
	public static void main(String[] args) {
		//System.out.println("Welcome to Hotel Reservation System");
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 3, 110, 90);
		hotelReservation.addHotel("Bridgewood", 4, 150, 50);
		hotelReservation.addHotel("Ridgewood", 5, 220, 150);
		
		hotelReservation.displayHotel();
		
		
		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);    
		LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);    
		String reservationSystem = hotelReservation.getCheapestHotel(startDate, endDate);
		System.out.println("The cheapest hotel is : " + reservationSystem);
}
}