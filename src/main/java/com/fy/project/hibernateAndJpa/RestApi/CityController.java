package com.fy.project.hibernateAndJpa.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fy.project.hibernateAndJpa.Business.ICityServices;
import com.fy.project.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	
	private ICityServices cityServices;

	@Autowired
	public CityController(ICityServices cityServices) {
		this.cityServices = cityServices;
	}
	
	@GetMapping("/cities")
	public List<City> get(){
		return cityServices.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city) {
		cityServices.add(city);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city) {
		cityServices.update(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		cityServices.delete(city);
	}
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id){
		return cityServices.getById(id);
	}
}
