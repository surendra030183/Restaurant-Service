package com.whcl.poc.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whcl.poc.service.model.DAORestaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<DAORestaurant, Long> {

	DAORestaurant findByRestaurantRegistrationNo(String restaurantRegistrationNo);

}
