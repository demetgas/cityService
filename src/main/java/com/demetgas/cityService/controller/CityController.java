package com.demetgas.cityService.controller;

import com.demetgas.cityService.model.City;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @GetMapping
    public ResponseEntity<List<City>> getCities() {
        City c1 = new City("06","Gilan");
        City c2 = new City("01","Pristine");

        List<City> cities = Arrays.asList(c1,c2);
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCity(@PathVariable String id){
        return null;
    }

}

