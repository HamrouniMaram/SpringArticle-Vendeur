package com.maram.articles.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomProd", types = { Article.class })
public interface ArticleProjection {

	
	public String getNomArticle();
	
}
