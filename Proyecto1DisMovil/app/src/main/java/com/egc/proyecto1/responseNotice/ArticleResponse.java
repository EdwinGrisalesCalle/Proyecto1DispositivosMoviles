package com.egc.proyecto1.responseNotice;

import com.egc.proyecto1.ModelsApiNotice.Article;
import com.egc.proyecto1.ModelsApiSpecie.ChildrenSpecie;

import java.util.ArrayList;

public class ArticleResponse {

    private ArrayList<Article> articles;

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }
}
