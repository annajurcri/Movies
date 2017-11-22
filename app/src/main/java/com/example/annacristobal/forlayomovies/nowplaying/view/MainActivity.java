package com.example.annacristobal.forlayomovies.nowplaying.view;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.annacristobal.forlayomovies.R;
import com.example.data.movies.api.MoviesApiDataSource;
import com.example.data.movies.api.model.MoviesDbApiResult;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestGetMovies testGetMovies = new TestGetMovies();

        testGetMovies.execute();
    }

    class TestGetMovies extends AsyncTask<String, String, Integer> {

        @Override
        protected Integer doInBackground(String... strings) {
            MoviesApiDataSource apiDataSource = new MoviesApiDataSource();
            MoviesDbApiResult nowPlaying = null;

            try {
                nowPlaying = apiDataSource.getNowPlaying();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Log.d("POTATO", "nowPlaying is null: " + (nowPlaying == null));
            return null;
        }

        @Override
        protected void onPostExecute(Integer s) {
            super.onPostExecute(null);
        }
    }
}