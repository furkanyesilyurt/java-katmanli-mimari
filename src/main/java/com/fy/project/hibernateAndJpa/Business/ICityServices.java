package com.fy.project.hibernateAndJpa.Business;

import java.util.List;

import com.fy.project.hibernateAndJpa.Entities.City;

public interface ICityServices {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
