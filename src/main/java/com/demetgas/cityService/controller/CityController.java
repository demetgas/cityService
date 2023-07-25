package com.demetgas.cityService.controller;

import com.demetgas.cityService.model.City;
import com.demetgas.cityService.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/cities")
    public ResponseEntity<List<City>> getCities() {
        return new ResponseEntity<>(cityService.getCities(), OK);
    }

    @GetMapping("/cities/{id}")
    public ResponseEntity<City> getCity(@PathVariable String id) {
        return new ResponseEntity<>(getCityById(id), OK);
    }
    @GetMapping("/cities")
    public ResponseEntity<City> getCity(@PathVariable String id) {
        return new ResponseEntity<>(getCityById(id), OK);
    }

    @PostMapping("/cities")
    public ResponseEntity<City> createCity(@RequestBody City newCity) {
        return new ResponseEntity<>(cityService.createCity(newCity), HttpStatus.CREATED);
    }

    @PutMapping("/cities/{id}")
    public ResponseEntity<City> updateCity(@PathVariable String id, @RequestBody City newCity) {
       cityService.updateCity(id,newCity);
        return new ResponseEntity<>(OK);
    }
    @DeleteMapping("/cities/{id}")
    public ResponseEntity<String> deleteCity(@PathVariable String id){
        cityService.deleteCity(id);
        return new ResponseEntity<>("You just deleted the city",OK);
    }


    private City getCityById(String id) {
        return cityService.getCityById(id);
    }

}

