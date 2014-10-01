package com.example.vrajeevan.myapplication.network.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vrajeevan on 9/30/14.
 */
public class Repo {
    @SerializedName("id") private int mId;
    @SerializedName("name") private String mName;

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }
}
