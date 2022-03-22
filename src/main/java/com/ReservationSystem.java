package com;

public class ReservationSystem {
	
		private String name;
		private int price;

		/**
		 * 
		 * @param name
		 * @param price
		 */
		public ReservationSystem(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "\nHotelDetails [name=" + name + ", price=" + price + "]";
		}

	}