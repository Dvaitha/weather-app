package com.weather.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Weather {

	@Id
	@GeneratedValue
	private long id;

	@Column
	private double longitute;

	@Column
	private double latitude;

	@Column
	private int temp;

	@Column
	private double feels_like;

	@Column
	private int temp_min;

	@Column
	private int temp_max;

	@Column
	private int pressure;

	@Column
	private int humidity;

	@Column
	private double wind_speed;

	@Column
	private int visibility;

	@Column
	private int wind_deg;

	@Column
	private int clouds;

	@Column
	private long date;

	@Column
	private String country;

	@Column
	private long sunrise;

	@Column
	private long sunset;

	public Weather(long id, double longitute, double latitude, int temp, double feels_like, int temp_min, int temp_max,
			int pressure, int humidity, double wind_speed, int visibility, int wind_deg, int clouds, long date,
			String country, long sunrise, long sunset) {
		super();
		this.id = id;
		this.longitute = longitute;
		this.latitude = latitude;
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
		this.wind_speed = wind_speed;
		this.visibility = visibility;
		this.wind_deg = wind_deg;
		this.clouds = clouds;
		this.date = date;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}

	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getLongitute() {
		return longitute;
	}

	public void setLongitute(double longitute) {
		this.longitute = longitute;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public double getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(double feels_like) {
		this.feels_like = feels_like;
	}

	public int getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(int temp_min) {
		this.temp_min = temp_min;
	}

	public int getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public double getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public int getWind_deg() {
		return wind_deg;
	}

	public void setWind_deg(int wind_deg) {
		this.wind_deg = wind_deg;
	}

	public int getClouds() {
		return clouds;
	}

	public void setClouds(int clouds) {
		this.clouds = clouds;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getSunrise() {
		return sunrise;
	}

	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}

	public long getSunset() {
		return sunset;
	}

	public void setSunset(long sunset) {
		this.sunset = sunset;
	}

	@Override
	public String toString() {
		return "Weather [id=" + id + ", longitute=" + longitute + ", latitude=" + latitude + ", temp=" + temp
				+ ", feels_like=" + feels_like + ", temp_min=" + temp_min + ", temp_max=" + temp_max + ", pressure="
				+ pressure + ", humidity=" + humidity + ", wind_speed=" + wind_speed + ", visibility=" + visibility
				+ ", wind_deg=" + wind_deg + ", clouds=" + clouds + ", date=" + date + ", country=" + country
				+ ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}

}
