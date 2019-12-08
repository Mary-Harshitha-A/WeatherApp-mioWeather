package com.example.weather_app.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("weather?")
    Call<WeatherInfo> getService(@Query("lat")String latitude,
                                 @Query("lon")String longitude,
                                 @Query("units")String units,
                                 @Query("appid")String id);
}
