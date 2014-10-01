package com.example.vrajeevan.myapplication.network;

import com.example.vrajeevan.myapplication.network.models.Repo;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by vrajeevan on 9/30/14.
 */
public interface GithubService {
    @GET("/repos/{owner}/{repo}")
    public Observable<Repo> getRepoForUser(@Path("owner") String owner, @Path("repo") String repo);

    @GET("/users/{owner}/repos")
    public Observable<List<Repo>> getReposForUser(@Path("owner") String owner);
}
