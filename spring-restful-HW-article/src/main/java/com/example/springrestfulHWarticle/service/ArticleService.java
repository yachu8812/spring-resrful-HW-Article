package com.example.springrestfulHWarticle.service;

import com.example.springrestfulHWarticle.model.Article;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ArticleService {

    //文章的 List
    private List<Article> articleList;
    private List<Article> findList;

    public ArticleService(){
        this.articleList = new ArrayList<>();
        this.articleList.add(new Article(1,"宋念","世界","世界是美麗的"));
        this.articleList.add(new Article(2,"宋念","宇宙","宇宙是無窮的"));
        this.articleList.add(new Article(3,"sherry","地球","地球是乘載生命"));

        this.findList = new ArrayList<>();
    }

    public List<Article> getAllArticles() {
        return this.articleList;
    }

    //用 author 找 Article
    public List<Article> getArticleByAuthor(String author) {
        this.findList = new ArrayList<>();
        for (Article article:articleList) {
            if(article.getAuthor().toLowerCase().equals(author.toLowerCase())){
                this.findList.add(article);

            }
        }
        if (this.findList != null) {
            return this.findList;
        }
        else{ return null;}

    }

    //新增一筆 Article
    public Article createArticle(Article newArticle) {
        this.articleList.add(newArticle);
        return newArticle;
    }

    //用 articleId 找到需要更新的 Article
    public Article updateArticle(int articleId,Article article) {

        for (Article updateArticle:articleList) {

            if(articleId == updateArticle.getArticleId()){

                updateArticle.setArticleBody(article.getArticleBody());
                updateArticle.setArticleTitle(article.getArticleTitle());

                return updateArticle;
            }
        }
        return null;
    }

    //用 articleId 找到要刪除的 Article
    public Article deleteArticle(int articleId) {
        for (Article article:articleList) {
            if(articleId == article.getArticleId()){
                articleList.remove(article);
                return article;
            }
        }
        return null;
    }


}
