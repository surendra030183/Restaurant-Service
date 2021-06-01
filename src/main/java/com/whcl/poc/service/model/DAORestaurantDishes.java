package com.whcl.poc.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dishes")
public class DAORestaurantDishes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long item_id;
	
	@Column
	private String name;
	
	@Column
	private String description; 
	
	@Column
	private double unitPrice;
	
	@Column
	private long restaurantId;
	
	@Column
	private int averageFoodPreaparationTime; // average food prep. time in minutes, it can vary based on many condition

	
//	@ManyToOne
//	private DAORestaurant restaurant;

	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getAverageFoodPreaparationTime() {
		return averageFoodPreaparationTime;
	}

	public void setAverageFoodPreaparationTime(int averageFoodPreaparationTime) {
		this.averageFoodPreaparationTime = averageFoodPreaparationTime;
	}

//	public DAORestaurant getRestaurant() {
//		return restaurant;
//	}
//
//	public void setRestaurant(DAORestaurant restaurant) {
//		this.restaurant = restaurant;
//	}
	
	
	
	
}
