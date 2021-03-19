package com.weather.app.serviceImpl;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.app.entities.Weather;
import com.weather.app.repository.WeatherRepository;
import com.weather.app.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;

	private String token = "token";

	@Override
	public Weather getWeather(String city) {
		Weather weather = new Weather();
		final String uri = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&mode=json&appid=" + token
				+ "&units=metric";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject root = new JSONObject(result);

		JSONObject coord = root.getJSONObject("coord");
		weather.setLongitute(coord.getDouble("lon"));
		System.out.println("Longitude : " + coord.getDouble("lon"));

		weather.setLatitude(coord.getDouble("lat"));
		System.out.println("Latitude : " + coord.getDouble("lon"));

		JSONObject main = root.getJSONObject("main");
		weather.setTemp(main.getInt("temp"));
		System.out.println("Temp : " + main.getInt("temp"));

		weather.setFeels_like(main.getDouble("feels_like"));
		System.out.println("Feels_like : " + main.getDouble("feels_like"));

		weather.setTemp_min(main.getInt("temp_min"));
		System.out.println("Temp_min : " + main.getInt("temp_min"));

		weather.setTemp_max(main.getInt("temp_max"));
		System.out.println("temp_max : " + main.getInt("temp_max"));

		weather.setPressure(main.getInt("pressure"));
		System.out.println("pressure : " + main.getInt("pressure"));

		weather.setHumidity(main.getInt("humidity"));
		System.out.println("humidity : " + main.getInt("humidity"));

		weather.setVisibility(root.getInt("visibility"));
		System.out.println("visibility : " + root.getInt("visibility"));

		JSONObject wind = root.getJSONObject("wind");
		weather.setWind_speed(wind.getDouble("speed"));
		System.out.println("speed : " + wind.getDouble("speed"));

		weather.setWind_deg(wind.getInt("deg"));
		System.out.println("deg : " + wind.getInt("deg"));

		weather.setClouds(root.getJSONObject("clouds").getInt("all"));
		System.out.println("clouds : " + root.getJSONObject("clouds").getInt("all"));

		weather.setDate(root.getLong("dt"));
		System.out.println("Date : " + root.getLong("dt"));

		JSONObject sys = root.getJSONObject("sys");
		weather.setCountry(sys.getString("country"));
		System.out.println("country : " + sys.getString("country"));

		weather.setSunrise(sys.getLong("sunrise"));
		System.out.println("sunrise : " + sys.getLong("sunrise"));

		weather.setSunset(sys.getLong("sunset"));
		System.out.println("sunset : " + sys.getLong("sunset"));

		return this.weatherRepository.save(weather);
	}

}
