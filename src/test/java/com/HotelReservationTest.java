package com;

import static org.junit.Assert.*;
import org.junit.Test;

public class HotelReservationTest {

	@Test
			public void givenHotelDetails_WhenCreated_ShouldReturnTrue() {
			HotelReservation hotelReservation = new HotelReservation();
			boolean result = hotelReservation.addHotel();
			assertEquals(true, result);
		}
	

}
