package com.example.annacristobal.forlayomovies.nowplaying.presenter;

import com.example.domain.exception.MovieDataException;
import com.example.domain.model.Movie;
import com.example.domain.usecase.GetNowPlayingMoviesUseCase;

import java.util.List;

public class NowPlayingPresenter {

    GetNowPlayingMoviesUseCase getNowPlayingMoviesUseCase;
    private NowPlayingView view;


    public NowPlayingPresenter(GetNowPlayingMoviesUseCase getNowPlayingMoviesUseCase) {
        this.getNowPlayingMoviesUseCase = getNowPlayingMoviesUseCase;
    }

    public void setView(NowPlayingView nowPlayingView) {
        this.view = nowPlayingView;
    }

    public void requestNowPlayingMovies() {
        try {
            List<Movie> movies = getNowPlayingMoviesUseCase.execute();
            view.showNowPlaying(movies);
        } catch (MovieDataException e) {
            view.showErrorMessage();
        }
    }

    public interface NowPlayingView {
        void showNowPlaying(List<Movie> movies);
        void showErrorMessage();
    }
}
