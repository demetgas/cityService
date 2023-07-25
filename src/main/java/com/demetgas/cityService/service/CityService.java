package com.demetgas.cityService.service;

import com.demetgas.cityService.model.City;
import com.demetgas.cityService.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private CityRepository cityRepository;
    public List<City> getCities() {
    }
}
