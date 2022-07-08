package com.example.api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();

        carList.add(new Car("BMW","g20"));
        carList.add(new Car("Audi","a4"));
        carList.add(new Car("Fiat","pnuto"));
    }

    public List<Car> getAllCars(){
        return carList;
    }


}
