package com.weather.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;
import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.repository.WeatherRepository;

//Fill your code here
@RestController
public class WeatherController {

    //Fill your code here
    @Autowired
    WeatherRepository weatherRepository;

    //Fill your code here
    @GetMapping("weatherReport")
    public List<WeatherReport> getData() {
        //Fill your code here
        List<WeatherReport> weatherReports = (List<WeatherReport>) weatherRepository.findAll();
        return weatherReports;
    }


    //Fill your code here
    @PostMapping("weatherReport")
    public WeatherReport addWeatherReport(@RequestBody WeatherReport cases) {
        //Fill your code here
        return weatherRepository.save(cases);
    }

    //Fill your code here
    @PutMapping("weatherReport")
    public WeatherReport updateWeatherReport(@RequestBody WeatherReport cases) {
        //Fill your code here
        return weatherRepository.save(cases);
    }

    //Fill your code here
    @GetMapping("weatherReport/{id}")
    public WeatherReport view(@PathVariable Long id) {
        //Fill your code here
        Optional<WeatherReport> optional = weatherRepository.findById(id);
        return optional.get();
    }

    //Fill your code here
    @DeleteMapping("weatherReport/{id}")
    public Boolean deleteUsers(@PathVariable Long id) {
        //Fill your code here

        try {
            weatherRepository.deleteById(id);
            return true;

        }catch (EmptyResultDataAccessException e){
            return true;
        }



    }

}
