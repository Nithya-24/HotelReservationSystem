package com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class HotelReservationTest {
	/**
	 * JUnit Testing purpose
	 */
	
	
	@Test
	public void test() {

		HotelReservation.addHotel("Lakewood", 110, 90);
		HotelReservation.addHotel("Bridgewood", 160, 60);
		HotelReservation.addHotel("Ridgewood", 220, 150);
		Assert.assertEquals(3, HotelReservation.countNoOfHotels());
	}

	
	public void givenDetailsOf3Hotels_InAGivenDataRage_shouldReturnCheapesthotel() {

		HotelReservation.addHotel("Lakewood", 110, 90);
		HotelReservation.addHotel("Bridgewood", 160, 60);
		HotelReservation.addHotel("Ridgewood", 220, 150);
		String cheapestHotelInfo = HotelReservation.findCheapestHotel("10-Sep-2020", "11-Sep-2020");
		Assert.assertEquals("Lakewood Total Cost: $110", cheapestHotelInfo);
	}
	
	@Test
	public void givenDetailsOf3Hotels_WhenWeekdayAndWeekendRatesAdded_ShouldReturnThoseRates() {

			HotelReservation.addHotel("Lakewood",110,90);
			HotelReservation.addHotel("Bridgewood",160,60);
			HotelReservation.addHotel("Ridgewood",220,150);
			List<Integer> weekendRoomRates = new ArrayList<>();
			List<Integer> weekdayRoomRates = new ArrayList<>();
			HotelReservation.hotelList.stream().forEach(hotelDetails -> {
				weekendRoomRates.add(hotelDetails.getWeekendHotelRate());
				weekdayRoomRates.add(hotelDetails.getWeekdayHotelRate());
			String cheapestHotelInfo = HotelReservation.findCheapestHotel("10 Sep 2020","11 Sep 2020");
			Assert.assertEquals("Lakewood Total Cost: $220",cheapestHotelInfo);
		});
			Assert.assertEquals(110, (int) weekdayRoomRates.get(0));
			Assert.assertEquals(160, (int) weekdayRoomRates.get(1));
			Assert.assertEquals(220, (int) weekdayRoomRates.get(2));
			Assert.assertEquals(90, (int) weekendRoomRates.get(0));
			Assert.assertEquals(60, (int) weekendRoomRates.get(1));
			Assert.assertEquals(150, (int) weekendRoomRates.get(2));
	}
}