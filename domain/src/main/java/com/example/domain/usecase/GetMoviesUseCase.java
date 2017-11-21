package com.example.domain.usecase;

import com.example.domain.model.Movie;
import com.example.domain.model.MoviesCollection;

import java.util.List;

public class GetMoviesUseCase {
    private MoviesCollection moviesCollection;

    public GetMoviesUseCase(MoviesCollection moviesCollection) {
        this.moviesCollection = moviesCollection;
    }

    public List<Movie> execute (){
        return moviesCollection.getAll();
    }
}
