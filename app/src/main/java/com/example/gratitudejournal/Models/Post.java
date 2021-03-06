package com.example.gratitudejournal.Models;

import com.google.firebase.database.ServerValue;

public class Post {

    private String title;
    private String description;
    private String picture;
    private String userId;
    private String userPhoto;
    private String username;
    private Object timeStamp;
    private String postKey;

    public Post(String title, String description, String picture,String username, String userId, String userPhoto) {
        this.title = title;
        this.description = description;
        this.picture = picture;
        this.username = username;
        this.userId = userId;
        this.userPhoto = userPhoto;
        this.timeStamp = ServerValue.TIMESTAMP;
    }

    public Post() {

    }

    public String getPostKey() {
        return postKey;
    }

    public void setPostKey(String postKey) {
        this.postKey = postKey;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public Object getTimeStamp() {
        return timeStamp;
    }

    public String getUsername() {
        return username;
    }
}
