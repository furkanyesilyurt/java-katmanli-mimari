package com.fy.project.hibernateAndJpa.DataAccess;
import java.util.List;
import com.fy.project.hibernateAndJpa.Entities.*;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
