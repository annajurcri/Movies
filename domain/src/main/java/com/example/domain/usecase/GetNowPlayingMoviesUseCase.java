package com.example.domain.usecase;

import com.example.domain.exception.MovieDataException;
import com.example.domain.model.Movie;
import com.example.domain.model.MoviesCollection;

import java.util.List;

public class GetNowPlayingMoviesUseCase {
    private MoviesCollection moviesCollection;

    public GetNowPlayingMoviesUseCase(MoviesCollection moviesCollection) {
        this.moviesCollection = moviesCollection;
    }

    public List<Movie> execute () throws MovieDataException {
        return moviesCollection.getNowPlaying();
    }
}
