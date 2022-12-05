package com.maram.articles.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maram.articles.entities.Article;
import com.maram.articles.entities.Vendeur;
import com.maram.articles.repos.ArticleRepository;
@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired
	ArticleRepository articleRepository;
	@Override
	public Article saveArticle(Article p) {
		return articleRepository.save(p);
	}
	@Override
	public Article updateArticle(Article p) {
	return articleRepository.save(p);
	}
	@Override
	public void deleteArticle(Article p) {
	articleRepository.delete(p);
	}
	 @Override
	public void deleteArticleById(Long id) {
	articleRepository.deleteById(id);
	}
	@Override
	public Article getArticle(Long id) {
	return articleRepository.findById(id).get();
	}
	@Override
	public List<Article> getAllArticles() {
	return articleRepository.findAll();
	}
	@Override
	public List<Article> findByNomArticle(String nom) {
	return articleRepository.findByNomArticle(nom);
	}
	@Override
	public List<Article> findByNomArticleContains(String nom) {
	return articleRepository.findByNomArticleContains(nom);
	}
	@Override
	public List<Article> findByNomPrix(String nom, Double prix) {
		return articleRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Article> findByVendeur(Vendeur vendeur) {
	return articleRepository.findByVendeur(vendeur);
	}
	@Override
	public List<Article> findByVendeurIdVen(Long id) {
	return articleRepository.findByVendeurIdVen(id);
	}
	@Override
	public List<Article> findByOrderByNomArticleAsc() {
	return articleRepository.findByOrderByNomArticleAsc();
	}
	@Override
	public List<Article> trierArticlesNomsPrix() {
	return articleRepository.trierArticlesNomsPrix();
	}
	}


