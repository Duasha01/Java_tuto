package com.weather.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.weather.jpa.domain.WeatherReport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//Fill your code here
@Repository("weatherRepository")
public interface WeatherRepository extends CrudRepository<WeatherReport, Long> {}
