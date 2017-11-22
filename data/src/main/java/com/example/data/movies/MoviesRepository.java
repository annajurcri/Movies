package com.example.data.movies;

import com.example.data.movies.api.MoviesApiDataSource;
import com.example.data.movies.api.MoviesApiMapper;
import com.example.data.movies.api.model.MoviesDbApiResult;
import com.example.domain.exception.MovieDataException;
import com.example.domain.model.Movie;
import com.example.domain.model.MoviesCollection;

import java.io.IOException;
import java.util.List;

public class MoviesRepository implements MoviesCollection {

    private final MoviesApiDataSource moviesApiDataSource;
    private final MoviesApiMapper moviesApiMapper;

    public MoviesRepository(MoviesApiDataSource moviesApiDataSource, MoviesApiMapper moviesApiMapper) {
        this.moviesApiDataSource = moviesApiDataSource;
        this.moviesApiMapper = moviesApiMapper;
    }

    @Override
    public List<Movie> getNowPlaying() throws MovieDataException {
        MoviesDbApiResult nowPlayingResult = null;
        try {
            nowPlayingResult = moviesApiDataSource.getNowPlaying();
        } catch (IOException e) {
            throw new MovieDataException();
        }
        return moviesApiMapper.toDomain(nowPlayingResult);
    }
}
