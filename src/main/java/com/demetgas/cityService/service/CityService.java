package com.demetgas.cityService.service;

import com.demetgas.cityService.model.City;
import com.demetgas.cityService.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityService {

    private final CityRepository cityRepository;
    public List<City> getCities() {
    }
}
