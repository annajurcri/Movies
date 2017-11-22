package com.example.data.movies.api;

import com.example.data.movies.api.model.MoviesDbApiMovie;
import com.example.data.movies.api.model.MoviesDbApiResult;
import com.example.domain.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoviesApiMapper {

    public Movie toDomain(MoviesDbApiMovie apiMovie) {
        long id = apiMovie.getId();
        String title = apiMovie.getTitle();
        String poster_path = apiMovie.getPosterPath();
        List<Long> genre_ids = apiMovie.getGenreIds();
        String backdrop_path = apiMovie.getBackdropPath();
        String overview = apiMovie.getOverview();
        String release_date = apiMovie.getReleaseDate();

        Movie movie = new Movie(id, title, poster_path, genre_ids, backdrop_path,
                overview, release_date);

        return movie;

    }

    public List<Movie> toDomain(MoviesDbApiResult apiResult) {
        List<Movie> movies = new ArrayList<>();
        for (MoviesDbApiMovie apiMovie : apiResult.getResults()) {
            Movie movie = toDomain(apiMovie);
            movies.add(movie);
        }

        return movies;
    }

}