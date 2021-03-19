package com.weather.app.service;

import com.weather.app.entities.Weather;

public interface WeatherService {
	public Weather getWeather(String city);
}
