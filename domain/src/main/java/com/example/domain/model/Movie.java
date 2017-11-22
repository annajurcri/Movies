package com.example.domain.model;


import java.util.List;

public class Movie {

    private final long id;
    private final String title;
    private final String poster_path;
    private final List<Long> genre_ids;
    private final String backdrop_path;
    private final String overview;
    private final String release_date;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public List<Long> getGenre_ids() {
        return genre_ids;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public Movie(long id, String title, String poster_path, List<Long> genre_ids, String backdrop_path, String overview, String release_date) {
        this.id = id;
        this.title = title;
        this.poster_path = poster_path;
        this.genre_ids = genre_ids;
        this.backdrop_path = backdrop_path;
        this.overview = overview;
        this.release_date = release_date;


    }



}
