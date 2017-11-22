package com.example.data.test;

import com.example.data.movies.api.MoviesApiMapper;
import com.example.data.movies.api.model.MoviesDbApiMovie;
import com.example.data.movies.api.model.MoviesDbApiResult;
import com.example.domain.model.Movie;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MoviesApiMapperTest {

    private static final int MOVIE_ID = 1;
    private static final boolean MOVIE_VIDEO = true;
    private static final int VOTE_COUNT = 10;
    private static final int VOTE_AVERAGE = 10;
    private static final String TITLE = "Thor";
    private static final int POPULARITY = 8;
    private static final String POSTER_PATH = "/sdsds.jpg";
    private static final String ORIGINAL_LANGUAGE = "en";
    private static final String ORIGINAL_TITLE = "Thor";
    private static final List<Long> GENRE_IDS = Arrays.asList(1L, 2L, 3L);
    private static final String BACKDROP_PATH = "/fff.jpg";
    private static final boolean ADULT = false;
    private static final String OVERVIEW = "blablabla";
    private static final String RELEASE_DATE = "22/10/2017";
    private static final MoviesDbApiMovie API_MOVIE = new MoviesDbApiMovie(
            VOTE_COUNT,
            MOVIE_ID,
            MOVIE_VIDEO,
            VOTE_AVERAGE,
            TITLE,
            POPULARITY,
            POSTER_PATH,
            ORIGINAL_LANGUAGE,
            ORIGINAL_TITLE,
            GENRE_IDS,
            BACKDROP_PATH,
            ADULT,
            OVERVIEW,
            RELEASE_DATE);
    private static final List<MoviesDbApiMovie> API_MOVIE_LIST = Arrays.asList(API_MOVIE, API_MOVIE, API_MOVIE);
    private static final MoviesDbApiResult API_MOVIE_RESULT = new MoviesDbApiResult(API_MOVIE_LIST, 0, 0, 0);
    @Test
    public void whenMappingToDomain_ShouldMaintainValues() {
        //Given
        MoviesApiMapper apiMapper = new MoviesApiMapper();
        //When
        Movie movie = apiMapper.toDomain(API_MOVIE);
        //Should
        assertEquals(MOVIE_ID, movie.getId());
        assertEquals(TITLE, movie.getTitle());
        assertEquals(POSTER_PATH, movie.getPoster_path());
        assertEquals(BACKDROP_PATH, movie.getBackdrop_path());
        assertEquals(OVERVIEW, movie.getOverview());
        assertEquals(RELEASE_DATE, movie.getRelease_date());
    }

    @Test
    public void whenMappingAList_ShouldMapAllValues() {
        MoviesApiMapper apiMapper = new MoviesApiMapper();
        List<Movie> movies = apiMapper.toDomain(API_MOVIE_RESULT);
        assertEquals(API_MOVIE_LIST.size(), movies.size());

    }

}