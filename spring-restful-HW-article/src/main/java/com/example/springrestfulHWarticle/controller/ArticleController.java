package com.example.springrestfulHWarticle.controller;

import com.example.springrestfulHWarticle.model.Article;
import com.example.springrestfulHWarticle.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
//http://localhost:8080/article

public class ArticleController {

    @Autowired
    private ArticleService ArticleService;

    @GetMapping()
    public List<Article> getAllArticle() {
        List<Article> articleList = this.ArticleService.getAllArticles();

        return articleList;
    }



    @GetMapping("/{author}")
    public List<Article> getArticleByAuthor(@PathVariable String author) {

        List<Article> articleList = this.ArticleService.getArticleByAuthor(author);
        return articleList;
    }

    @PostMapping()
    public Article createArticle(@RequestBody Article article) {

        Article createArticle = this.ArticleService.createArticle(article);
        return createArticle;
    }

    @PutMapping("/{articleId}")
    public Article updateArticle(@PathVariable int articleId, @RequestBody Article article) {

        Article updateArticle = this.ArticleService.updateArticle(articleId, article);
        return updateArticle;
    }

    @DeleteMapping("/{articleId}")
    public Article deleteArticle(@PathVariable int articleId) {

        Article article = this.ArticleService.deleteArticle(articleId);
        return article;
    }

}
