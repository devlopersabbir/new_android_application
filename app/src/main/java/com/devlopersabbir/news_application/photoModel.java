package com.devlopersabbir.news_application;

public class photoModel {
    int albumId;
    int id;
    String title;
    String url;
    String thumbnailUrl;

    public photoModel(int albumId, int id, String title, String url, String thumbnailUrl){
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getAlbumId(){
        return albumId;
    }
    public void setAlbumId(){
        this.albumId = albumId;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public  void setTitle(){
        this.title = title;
    }
    public String getUrl(){
        return url;
    }
    public  void setUrl(){
        this.url = url;
    }
    public String getThumbnailUrl(){
        return thumbnailUrl;
    }
    public  void setThumbnailUrl(){
        this.thumbnailUrl = thumbnailUrl;
    }
}
