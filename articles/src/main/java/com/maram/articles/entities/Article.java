package com.maram.articles.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticle;
	private String nomArticle;
	private Double prixArticle;
	private Date dateCreation;
	@ManyToOne
	private Vendeur vendeur;

	public Article() {
	super();
	}
	public Article(String nomArticle, Double prixArticle, Date dateCreation) {
		super();
		this.nomArticle = nomArticle;
		this.prixArticle = prixArticle;
		this.dateCreation = dateCreation;
		}
	public Long getIdArticle() {
		return idArticle;
		}
		public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
		}
		public String getNomArticle() {
		return nomArticle;
		}
		public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
		}
		public Double getPrixArticle() {
		return prixArticle;
		}
		public void setPrixArticle(Double prixArticle) {
		this.prixArticle = prixArticle;
		}
		public Date getDateCreation() {
		return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
		}
		
		public Vendeur getVendeur() {
			return vendeur;
		}
		public void setVendeur(Vendeur vendeur) {
			this.vendeur = vendeur;
		}
		@Override
		public String toString() {
		return "Article [idArticle=" + idArticle + ", nomArticle=" + 
		nomArticle + ", prixArticle=" + prixArticle
		+ ", dateCreation=" + dateCreation + "]";
		}

}
