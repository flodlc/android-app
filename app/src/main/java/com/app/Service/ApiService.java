package com.app.Service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Florian on 05/01/2018.
 */

public interface ApiService {
    @GET("beers")
    Call<List> listBeers();
}
