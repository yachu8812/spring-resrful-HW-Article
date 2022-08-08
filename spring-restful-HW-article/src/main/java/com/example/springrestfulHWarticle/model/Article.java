package com.example.springrestfulHWarticle.model;



import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Article {

    private int articleId;          //文章編號
    private String author;          //文章作者
    private String articleTitle;    //文章標題
    private String articleBody;     //文章內容


    public Article(int articleId, String author, String articleTitle, String articleBody) {
        this.articleId = articleId;
        this.author = author;
        this.articleTitle = articleTitle;
        this.articleBody = articleBody;
    }


}
