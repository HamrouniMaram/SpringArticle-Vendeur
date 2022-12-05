package com.maram.articles.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vendeur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idVen;
private String nomVen;
private String descriptionVen;
@JsonIgnore
@OneToMany(mappedBy = "vendeur")
private List<Article> articles;
}