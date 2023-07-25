package com.demetgas.cityService.controller;

import com.demetgas.cityService.model.City;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    public ResponseEntity<List<City>> getCities(){

        return null;
    }
}
