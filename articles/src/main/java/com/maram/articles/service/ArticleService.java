package com.maram.articles.service;
import java.util.List;
import com.maram.articles.entities.Article;
import com.maram.articles.entities.Vendeur;
public interface ArticleService {
	Article saveArticle(Article p);
	Article updateArticle(Article p);
	void deleteArticle(Article p);
	 void deleteArticleById(Long id);
	Article getArticle(Long id);
	List<Article> getAllArticles();
	List<Article> findByNomArticle(String nom);
	List<Article> findByNomArticleContains(String nom);
	List<Article> findByNomPrix (String nom, Double prix);
	List<Article> findByVendeur (Vendeur vendeur);
	List<Article> findByVendeurIdVen(Long id);
	List<Article> findByOrderByNomArticleAsc();
	List<Article> trierArticlesNomsPrix();
}
