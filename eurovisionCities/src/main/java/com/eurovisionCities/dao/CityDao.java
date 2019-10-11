package com.eurovisionCities.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.eurovisionCities.entity.City;

public class CityDao {

	JdbcTemplate model;

	public void setTemplate(JdbcTemplate model) {
	this.model = model;
	}

	public City login(String name) {
	String sql = "SELECT * FROM cities WHERE name = ? ;";
	try {
	return model.queryForObject(sql, new Object[] { name }, new BeanPropertyRowMapper<City>(City.class));
	}catch(Exception e) {
	return null;
	}
	}
	
}
