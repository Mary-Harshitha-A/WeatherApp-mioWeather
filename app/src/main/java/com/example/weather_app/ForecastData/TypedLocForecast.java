package com.example.weather_app.ForecastData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TypedLocForecast {
    @GET("forecast?")
    Call<HourlyForecast> getTypedForecastService(@Query("q")String location,
                                                 @Query("units")String units,
                                                 @Query("appid")String id);
}
