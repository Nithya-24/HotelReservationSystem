package com;
import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		
		/**
		 * Main method to pass the details of hotels
		 */
	
			Scanner sc = new Scanner(System.in);
		//	System.out.println("Welcome to Hotel Reservation");

			for (int i = 1; i <= 3; i++) {
				System.out.println("Enter the hotel name : ");
				String hotelName = sc.next();
				System.out.println("Enter the Week-Days Rates : ");
				int weekDayRates = sc.nextInt();
				System.out.println("Enter the Week-End Rates : ");
				int weekEndRates = sc.nextInt();
				HotelReservation.addHotel1(hotelName, weekDayRates,weekEndRates);
			}
			HotelReservation.showHotel();
			/**
			 *  To find Cheapest rate on given date intervals
			 */
			System.out.println("Enter the start date (DD-MMM-YYYY)");
			String sd = sc.next();
			System.out.println("Enter the end date (DD-MMM-YYYY)");
			String ed = sc.next();
			HotelReservation.findCheapestHotel(sd, ed);
		}
	}