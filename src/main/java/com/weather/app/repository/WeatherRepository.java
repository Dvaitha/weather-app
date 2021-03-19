package com.weather.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weather.app.entities.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long>{

}
