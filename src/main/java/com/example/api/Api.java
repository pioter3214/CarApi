package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api {
    private CarService carService;

    @Autowired
    public Api(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getCars(){
        return new ResponseEntity(carService.getAllCars(), HttpStatus.OK);
    }
}
