package com.gerhorgan.myplaces;

import com.gerhorgan.myplaces.POJO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gerhorgan on 11/01/2017.
 */

public interface RetrofitMaps {
    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
     */
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")
    Call<Example> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);

}
