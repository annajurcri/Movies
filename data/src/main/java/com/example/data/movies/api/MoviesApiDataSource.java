package com.example.data.movies.api;

import com.example.data.movies.api.model.MoviesDbApiResult;

import java.io.IOException;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MoviesApiDataSource {

    private final MoviesApiService service;

    public MoviesApiDataSource() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(MoviesApiService.class);
    }

    public MoviesDbApiResult getNowPlaying() throws IOException {
        Response<MoviesDbApiResult> response = service.getNowPlayingMovies("74d394e3de0d780905750987a7f89ddb").execute();
        return response.body();
    }
}
