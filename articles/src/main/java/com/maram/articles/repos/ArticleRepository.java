package com.maram.articles.repos;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.maram.articles.entities.Article;
import com.maram.articles.entities.Vendeur;
@RepositoryRestResource(path = "rest")
public interface ArticleRepository extends JpaRepository<Article, Long> {
	List<Article> findByNomArticle(String nom);
	 List<Article> findByNomArticleContains(String nom); 
	/* @Query("select p from Article p where p.nomArticle like %?1 and p.prixArticle > ?2")
	 List<Article> findByNomPrix (String nom, Double prix);*/
	 @Query("select p from Article p where p.nomArticle like %:nom and p.prixArticle > :prix")
	 List<Article> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	 @Query("select p from Article p where p.vendeur = ?1")
	 List<Article> findByVendeur (Vendeur vendeur);
	 List<Article> findByVendeurIdVen(Long id);
	 List<Article> findByOrderByNomArticleAsc();
	 @Query("select p from Article p order by p.nomArticle ASC, p.prixArticle DESC")
	 List<Article> trierArticlesNomsPrix ();
}
