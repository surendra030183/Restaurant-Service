package com.whcl.poc.service.model;

public class DishesDTO {

	private long item_id;
	private String name;
	private String description;
	private double unitPrice;
	private long restaurantId;
	private int averageFoodPreaparationTime; // average food prep. time in minutes, it can vary based on many condition


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

}
