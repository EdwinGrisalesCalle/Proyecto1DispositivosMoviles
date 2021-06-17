package com.egc.proyecto1.IntroScreen;

public class ScreenItem {

    String Title,Description;
    String ScreenImg;
    String UrlArticle;

    public ScreenItem(String title, String description, String screenImg,String urlArticle) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
        ScreenImg = screenImg;
        UrlArticle = urlArticle;
    }

    public String getUrlArticle() {
        return UrlArticle;
    }

    public void setUrlArticle(String urlArticle) {
        UrlArticle = urlArticle;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(String screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getScreenImg() {
        return ScreenImg;
    }
}
