package com.demetgas.cityService.controller;

import com.demetgas.cityService.model.City;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/cities")
public class CityController {

    private static final List<City> cities = new ArrayList<>();

    public CityController() {
        if (cities.isEmpty()) {
            City c1 = new City(new Date(), "06", "Gilan");
            City c2 = new City(new Date(), "01", "Pristine");

            cities.add(c1);
            cities.add(c2);
        }

    }

    @GetMapping
    public ResponseEntity<List<City>> getCities() {

        return new ResponseEntity<>(cities, OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCity(@PathVariable String id) {
        City result = getCityById(id);

        return new ResponseEntity<>(result, OK);
    }

    @PostMapping
    public ResponseEntity<City> createCity(@RequestBody City newCity) {
        newCity.setCreatedDate(new Date());
        cities.add(newCity);
        return new ResponseEntity<>(newCity, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<City> updateCity(@PathVariable String id, @RequestBody City newCity) {
        City oldCity = getCityById(id);
        oldCity.setName(newCity.getName());
        oldCity.setCreatedDate(new Date());
        return new ResponseEntity<>(oldCity,OK);
    }

    private City getCityById(String id) {
        return cities.stream()
                .filter(city -> city.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("City not found!"));
    }

}

