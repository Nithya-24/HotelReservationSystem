package com;

import static org.junit.Assert.*;
import org.junit.Test;

public class HotelReservationTest {
	/**
	 * JUnit Testing purpose
	 */
	
	
	@Test
	public void test() {

		HotelReservation.addHotel("Lakewood", 110);
		HotelReservation.addHotel("Bridgewood", 160);
		HotelReservation.addHotel("Ridgewood", 220);
		assertEquals(3, HotelReservation.countNoOfHotels());
	}

	
	@Test
	public void givenDetailsOf3Hotels_InAGivenDataRage_shouldReturnCheapesthotel() {

		HotelReservation.addHotel("Lakewood", 110);
		HotelReservation.addHotel("Bridgewood", 160);
		HotelReservation.addHotel("Ridgewood", 220);
		String cheapestHotelInfo = HotelReservation.findCheapestHotel("10-09-2020", "11-09-2020");
		assertEquals("Lakewood Total Cost: $110", cheapestHotelInfo);
	}
}