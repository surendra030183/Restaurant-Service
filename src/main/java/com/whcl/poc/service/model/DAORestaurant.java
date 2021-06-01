package com.whcl.poc.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="RESTAURANT")
public class DAORestaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long restaurant_id;
	
	@Column
	private String restaurantRegistrationNo; // registered id provided by government

	
	@Column
	private String name;
	
	@Column
	private String address_Number;
	
	@Column
	private String address_Street;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String country;
	
	@Column
	private int pincode;
	
	@Transient
	private String status;
	
//	@OneToMany(mappedBy="restaurant", cascade = CascadeType.ALL, orphanRemoval=true)
//    Set<DAORestaurantDishes> restaurantDishes = new HashSet<DAORestaurantDishes>();

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

	public long getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(long restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

//	public Set<DAORestaurantDishes> getRestaurantDishes() {
//		return restaurantDishes;
//	}
//
//	public void setRestaurantDishes(Set<DAORestaurantDishes> restaurantDishes) {
//		this.restaurantDishes = restaurantDishes;
//	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getRestaurantRegistrationNo() {
		return restaurantRegistrationNo;
	}

	public void setRestaurantRegistrationNo(String restaurantRegistrationNo) {
		this.restaurantRegistrationNo = restaurantRegistrationNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
