package com.example.weather_app.ForecastData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ForecastService {
    @GET("forecast?")
    Call<HourlyForecast> getForecastService(@Query("lat")String latitude,
                                            @Query("lon")String longitude,
                                            @Query("units")String units,
                                            @Query("appid")String id);
}
