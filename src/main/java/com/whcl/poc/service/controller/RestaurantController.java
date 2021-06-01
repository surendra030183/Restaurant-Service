package com.whcl.poc.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whcl.poc.service.RestaurantService;
import com.whcl.poc.service.model.DAORestaurant;
import com.whcl.poc.service.model.DishesDTO;
import com.whcl.poc.service.model.RestaurantDTO;

@RestController
@RequestMapping
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	@PostMapping("/api/v1.0/restaurant/register")
	public ResponseEntity<DAORestaurant> registerRestaurant(@RequestBody RestaurantDTO restaurant){
		return ResponseEntity.ok(restaurantService.registerRestaurant(restaurant));
		
	}
	
	@GetMapping("/api/v1.0/restaurant/all")
	private ResponseEntity<List<DAORestaurant>> findAllRestaurant() {
		return ResponseEntity.ok(restaurantService.findAllRestaurant());
	}
	
	@PostMapping("/api/v1.0/restaurant/add/dishes")
	public ResponseEntity<String> addDishesToRestaurant(@RequestBody List<DishesDTO> dishes){
		return ResponseEntity.ok(restaurantService.addDishesToRestaurant(dishes));
	}
	
	@GetMapping("hello")
	private String hello() {
		return "Welcome, you did it.";
	}
	
}
