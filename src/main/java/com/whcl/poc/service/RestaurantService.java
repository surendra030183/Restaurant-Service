package com.whcl.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whcl.poc.service.model.DAORestaurant;
import com.whcl.poc.service.model.DAORestaurantDishes;
import com.whcl.poc.service.model.DishesDTO;
import com.whcl.poc.service.model.RestaurantDTO;
import com.whcl.poc.service.repository.RestaurantDishesRepository;
import com.whcl.poc.service.repository.RestaurantRepository;

@Service
@Transactional
public class RestaurantService {

	@Autowired 
	private RestaurantRepository restaurantRepo;
	
	@Autowired 
	private RestaurantDishesRepository restaurantDishesRepo;
	
	/**
	 * Register new restaurant
	 * @param restaurant
	 * @return
	 */
	public DAORestaurant registerRestaurant(RestaurantDTO restaurant) {
		
		DAORestaurant restaurantDb = restaurantRepo.findByRestaurantRegistrationNo(restaurant.getRestaurantRegistrationNo());
		
		
		if(restaurantDb != null) {
			restaurantDb.setStatus("Restaurant already exist");
			return restaurantDb;
		}
		
		DAORestaurant newRestaurant = new DAORestaurant();
		newRestaurant.setName(restaurant.getName());
		newRestaurant.setAddress_Number(restaurant.getAddress_Number());
		newRestaurant.setAddress_Street(restaurant.getAddress_Street());
		newRestaurant.setCity(restaurant.getCity());
		newRestaurant.setState(restaurant.getState());
		newRestaurant.setCountry(restaurant.getCountry());
		newRestaurant.setRestaurantRegistrationNo(restaurant.getRestaurantRegistrationNo());
		
		return restaurantRepo.save(newRestaurant);
	}

	/**
	 * Find all restaurant
	 * @return
	 */
	public List<DAORestaurant> findAllRestaurant() {
		return restaurantRepo.findAll();
	}

	/**
	 * Add dishes to restaurant
	 * @param dishes
	 * @return
	 */
	public String addDishesToRestaurant(List<DishesDTO> dishes) {
		
		for (DishesDTO dish : dishes) {
			DAORestaurantDishes newDish = new DAORestaurantDishes();
			newDish.setName(dish.getName());
			newDish.setDescription(dish.getDescription());
			newDish.setUnitPrice(dish.getUnitPrice());
			newDish.setRestaurantId(dish.getRestaurantId());
			newDish.setAverageFoodPreaparationTime(dish.getAverageFoodPreaparationTime());
			
			restaurantDishesRepo.save(newDish);
		}
		return "Success";
	}
}
