package com.example.weather_app.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserEnteredLoc {
    @GET("weather?")
    Call<WeatherInfo> getService(@Query("q")String place,
                                 @Query("units")String units,
                                 @Query("appid")String id);
}
