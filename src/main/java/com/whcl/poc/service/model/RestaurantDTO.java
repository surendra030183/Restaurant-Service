package com.whcl.poc.service.model;

public class RestaurantDTO {

	private long restaurant_id;
	private String restaurantRegistrationNo; // registered id provided by government
	private String name;
	private String address_Number;
	private String address_Street;
	private String city;
	private String state;
	private String country;

	public long getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(long restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress_Number() {
		return address_Number;
	}

	public void setAddress_Number(String address_Number) {
		this.address_Number = address_Number;
	}

	public String getAddress_Street() {
		return address_Street;
	}

	public void setAddress_Street(String address_Street) {
		this.address_Street = address_Street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRestaurantRegistrationNo() {
		return restaurantRegistrationNo;
	}

	public void setRestaurantRegistrationNo(String restaurantRegistrationNo) {
		this.restaurantRegistrationNo = restaurantRegistrationNo;
	}

}
