package com.maram.articles;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.maram.articles.entities.Article;
import com.maram.articles.entities.Vendeur;
import com.maram.articles.repos.ArticleRepository;
@SpringBootTest
class ArticlesApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;
	@Test
	public void testCreateArticle() {
	Article prod = new Article("PC Dell",2200.500,new Date());
	articleRepository.save(prod);
	}
	@Test
	public void testFindArticle()
	{
	Article p = articleRepository.findById(2L).get(); 
	System.out.println(p);
	}
	@Test
	public void testUpdateArticle()
	{
	Article p = articleRepository.findById(2L).get();
	p.setPrixArticle(1000.0);
	articleRepository.save(p);
	}
	@Test
	public void testDeleteArticle()
	{
	articleRepository.deleteById(4L);
	}
	 
	@Test
	public void testListerTousArticles()
	{
	List<Article> prods = articleRepository.findAll();
	for (Article p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testFindByNomArticle()
	{
	List<Article> prods = articleRepository.findByNomArticle("PC Dell");
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomArticleContains()
	{
	List<Article> prods=articleRepository.findByNomArticleContains("P");
	for (Article p : prods)
	{
	System.out.println(p);
	} }
	@Test
	public void testfindByNomPrix()
	{
	List<Article> prods = articleRepository.findByNomPrix("PC Assus", 1000.0);
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByVendeur()
	{
	Vendeur cat = new Vendeur();
	cat.setIdVen(1L);
	List<Article> prods = articleRepository.findByVendeur(cat);
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByVendeurIdVen()
	{
	List<Article> prods = articleRepository.findByVendeurIdVen(1L);
	for (Article p : prods)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomArticleAsc()
	{
	List<Article> prods = 
	articleRepository.findByOrderByNomArticleAsc();
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierArticlesNomsPrix()
	{
	List<Article> prods = articleRepository.trierArticlesNomsPrix();
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}

}
