package com.example.wagubibrian.github_connect.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class GithubUsers implements Parcelable{
    @SerializedName("login")
    private String userName;

    @SerializedName("avatar_url")
    private String profileImage;

    @SerializedName("email")
    private String email;

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("company")
    private String company;

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

        @Override
        public GithubUsers createFromParcel(Parcel source) {
            return new GithubUsers(source);
        }

        @Override
        public GithubUsers[] newArray(int size) {
            return new GithubUsers[size];
        }
    };

    public GithubUsers(String userName, String profileImage, String email, String htmlUrl, String company) {

        this.userName = userName;
        this.profileImage = profileImage;
        this.email = email;
        this.htmlUrl = htmlUrl;
        this.company = company;
    }

    public GithubUsers(Parcel source) {
        this.userName = source.readString();
        this.profileImage = source.readString();
        this.email = source.readString();
        this.htmlUrl = source.readString();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userName);
        dest.writeString(this.profileImage);
        dest.writeString(this.email);
        dest.writeString(this.htmlUrl);
    }


}
