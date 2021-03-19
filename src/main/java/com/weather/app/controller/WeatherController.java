package com.weather.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weather.app.entities.Weather;
import com.weather.app.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@GetMapping("/weather/{city}")
	public Weather getWeather(@PathVariable String city) {
		Weather w=this.weatherService.getWeather(city);
		return w;
	}
}
