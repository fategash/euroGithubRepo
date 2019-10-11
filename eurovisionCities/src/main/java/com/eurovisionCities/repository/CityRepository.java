package com.eurovisionCities.repository;

import org.springframework.data.repository.CrudRepository;
import com.eurovisionCities.entity.City;

public interface CityRepository extends CrudRepository<City, Integer>{

	City findByName(String name);
}
