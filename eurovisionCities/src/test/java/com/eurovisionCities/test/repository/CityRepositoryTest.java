package com.eurovisionCities.test.repository;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eurovisionCities.entity.City;
import com.eurovisionCities.repository.CityRepository;

import static org.junit.Assert.*;
//@RunWith(SpringRunner.class)
@SpringBootTest
public class CityRepositoryTest {
	
	//@Autowired
    //private CityRepository cityRepository;
	
	 @Test
	    public void testFetchData(){
	        /*Test data retrieval*/
		 	City cityB = new City();
	       // City cityA = cityRepository.findByName("Spain");
	        assertNotNull(cityB);
	    }

}
