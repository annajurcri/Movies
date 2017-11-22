package com.example.data.movies.api;

import com.example.data.movies.api.model.MoviesDbApiResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoviesApiService {

    //https://api.themoviedb.org/3/movie/now_playing?api_key=74d394e3de0d780905750987a7f89ddb&language=en-US&page=1


    @GET ("movie/now_playing")
    Call<MoviesDbApiResult> getNowPlayingMovies(@Query("api_key") String apiKey);
}
