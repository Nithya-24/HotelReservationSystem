package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservation {
	
	ArrayList<ReservationSystem> hotelList = new ArrayList<ReservationSystem>();
	public static double cheapestPrice;
//	HotelReservation hotelReservation = new HotelReservation();
//	ReservationSystem reservationSystem = new ReservationSystem();
//	
     
	/**
	 * In this method we will add the hotel to the ArrayList
	 * @param hotelName - we will pass the hotel name
	 * @param rating - we will pass the rating of the hotel
	 * @param weekDayRateRegular - We will pass the rate of week day for the regular customer
	 * @param weekendRateRegular -  we will pass the weekend rate for the regular customer
	 * @return
	 */
	
	public void addHotel(String hotelName, int rating, double weekdayRegularCustomerCost, double weekendRegularCustomerCost) {
		ReservationSystem reservationSystem = new ReservationSystem();
		reservationSystem.setHotelName(hotelName);
		reservationSystem.setRating(rating);
		reservationSystem.setWeekdayRegularCustomerCost(weekdayRegularCustomerCost);
		reservationSystem.setWeekendRegularCustomerCost(weekendRegularCustomerCost);
			hotelList.add(reservationSystem);
		}
	
	/**
	 *  To display the hotel name and the details
	 */
	public void displayHotel() {
		System.out.println(hotelList);
		
	}
	public int getHotelListSize() {
		return hotelList.size();
	}
	
	public void printHotelList() {
		System.out.println(hotelList);
	}
	
	public ArrayList<ReservationSystem> getHotelList(){
		return hotelList;
	}
	
	/**
	 * Method to find the cheapest hotel. 
	 * Then comparing the regular cost of the hotel and finding the cheapest hotel
	 * We are using the min method to get the list of minimum cost.
	 * @param startDate 
	 * @param endDate
	 * @return
	 */
	public ArrayList<ReservationSystem> getCheapestHotel(LocalDate startDate, LocalDate endDate) {

		int numberOfDays = (int) ChronoUnit.DAYS.between(startDate, endDate);
        int weekends = 0;
        
		while (startDate.compareTo(endDate) != 0) {
            switch (DayOfWeek.of(startDate.get(ChronoField.DAY_OF_WEEK))) {
                case SATURDAY:
                    ++weekends;
                    break;
                case SUNDAY:
                    ++weekends;
                    break;
            }
            startDate = startDate.plusDays(1);
        }
		
		final int weekdaysNumber = numberOfDays - weekends;
		final int weekendsNumber = weekends;
		
		final double cheapestPrice = hotelList.stream()
				.mapToDouble(hotel -> ((hotel.getWeekendRegularCustomerCost()*weekendsNumber) + hotel.getWeekdayRegularCustomerCost()*weekdaysNumber))
				.min()
				.orElse(Double.MAX_VALUE);
		
		ArrayList<ReservationSystem> cheapestHotel = hotelList.stream()
				.filter(reservationSystem -> (reservationSystem.getWeekendRegularCustomerCost()*weekendsNumber + reservationSystem.getWeekendRegularCustomerCost()*weekdaysNumber) == cheapestPrice)
				.collect(Collectors.toCollection(ArrayList::new));
		
		
		  if (cheapestPrice != Double.MAX_VALUE) {
	        	Iterator<ReservationSystem> iterator = cheapestHotel.iterator();
	        	while(iterator.hasNext()) {
	        		System.out.println("Cheap Hotel : \n" + iterator.next().getHotelName() + ", Total Rates: " + cheapestPrice);
	        	}
	        	return cheapestHotel;
	        }
	        return null;
		}
		
		public ReservationSystem getCheapestBestRatedHotel(LocalDate startDate, LocalDate endDate){
			
			ArrayList<ReservationSystem> cheapestHotels = (ArrayList<ReservationSystem>) getCheapestHotel(startDate, endDate);
			Optional<ReservationSystem> sortedHotelList = cheapestHotels.stream().max(Comparator.comparing(ReservationSystem::getRating));
			
			System.out.println("Cheapest Best Rated Hotel : \n" + sortedHotelList.get().getHotelName() + ", Total Rates: " + cheapestPrice);
			return sortedHotelList.get();
		}

	

}