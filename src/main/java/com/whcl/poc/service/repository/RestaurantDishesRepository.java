package com.whcl.poc.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whcl.poc.service.model.DAORestaurantDishes;

@Repository
public interface RestaurantDishesRepository extends JpaRepository<DAORestaurantDishes, Long> {

}
