# weather-app
A Spring Boot weather app using open weather API.
Functionalities of the application is you can get the details of the weather by just providing city name.
Data of all the searches at the time are stored in a mysql DB so that user can get the searches details.
weather data would be collected in a table called weather in Database.
Easy to implement in Company projects.
NOTE : while using the app please add your open weather token in WeatherServiceImpl file. and also change DB credentials in application.properties file.

Request format :
localhost:8080/weather/{city_name}
Example :
localhost:8080/weather/pune

Output Example :
```
{
    "id": 23,
    "longitute": 73.8553,
    "latitude": 18.5196,
    "temp": 22,
    "feels_like": 20.57,
    "temp_min": 22,
    "temp_max": 22,
    "pressure": 1010,
    "humidity": 29,
    "wind_speed": 1.47,
    "visibility": 10000,
    "wind_deg": 308,
    "clouds": 0,
    "date": 1616183619,
    "country": "IN",
    "sunrise": 1616202527,
    "sunset": 1616246122
}
```

Getting Weather Info :
![image](https://user-images.githubusercontent.com/34769208/111836102-cc524c80-891b-11eb-8dc9-47c1693292e5.png)

Database Structure :
![image](https://user-images.githubusercontent.com/34769208/111836466-57334700-891c-11eb-915f-8a16cfde3c98.png)

Database Data Storage :
![image](https://user-images.githubusercontent.com/34769208/111836512-6ca87100-891c-11eb-866f-7de7f455944a.png)


