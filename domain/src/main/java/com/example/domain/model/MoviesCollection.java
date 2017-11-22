package com.example.domain.model;

import com.example.domain.exception.MovieDataException;

import java.util.List;

public interface MoviesCollection {

    public List<Movie> getNowPlaying() throws MovieDataException;

}
