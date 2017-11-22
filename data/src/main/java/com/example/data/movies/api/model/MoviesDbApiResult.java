package com.example.data.movies.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MoviesDbApiResult {
    @SerializedName("results")
    private List<MoviesDbApiMovie> results;
    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public List<MoviesDbApiMovie> getResults() {
        return results;
    }

    public void setResults(List<MoviesDbApiMovie> results) {
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public MoviesDbApiResult(List<MoviesDbApiMovie> results, int page, int totalResults, int totalPages) {
        this.results = results;
        this.page = page;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
    }
}
