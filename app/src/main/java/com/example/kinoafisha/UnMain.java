package com.example.kinoafisha;

import com.google.gson.annotations.SerializedName;

public class UnMain {
    private int id;
    private String name;
    private String url;
    private String image;
    private String vote;
    @SerializedName("count_vote")
    private String countVote;
    private String phone;
    private String address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }

    public String getVote() {
        return vote;
    }

    public String getCountVote() {
        return countVote;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
