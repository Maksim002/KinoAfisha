package com.example.kinoafisha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public class UnMain implements Parcelable {
    private int id;
    private String name;
    private String url;
    private String image;
    private String vote;
    @SerializedName("count_vote")
    private String countVote;
    private String phone;
    private String address;

    protected UnMain(Parcel in) {
        id = in.readInt();
        name = in.readString();
        url = in.readString();
        image = in.readString();
        vote = in.readString();
        countVote = in.readString();
        phone = in.readString();
        address = in.readString();
    }

    public static final Creator<UnMain> CREATOR = new Creator<UnMain>() {
        @Override
        public UnMain createFromParcel(Parcel in) {
            return new UnMain(in);
        }

        @Override
        public UnMain[] newArray(int size) {
            return new UnMain[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(url);
        dest.writeString(image);
        dest.writeString(vote);
        dest.writeString(countVote);
        dest.writeString(phone);
        dest.writeString(address);
    }
}
