package com.demetgas.cityService.service;

import com.demetgas.cityService.model.City;
import com.demetgas.cityService.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class CityService {

    private final CityRepository cityRepository;
    public List<City> getCities() {
        return cityRepository.findAll();
    }

    public City createCity(City newCity){
        return cityRepository.save(newCity);
    }

    public void deleteCity(String id){
        cityRepository.deleteById(id);
    }

    public City getCityById(String id){
        return cityRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("City not found!"));

    }
    public void updateCity(String id, City newCity){
        City oldCity = getCityById(id);
        oldCity.setName(newCity.getName());
        cityRepository.save(oldCity);
    }
}
