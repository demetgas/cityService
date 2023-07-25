package com.demetgas.cityService.repository;

import com.demetgas.cityService.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepository extends MongoRepository<City, String> {
}
