package com.maram.articles.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.maram.articles.entities.Vendeur;
@RepositoryRestResource(path = "ven")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular 
public interface VendeurRepository extends JpaRepository<Vendeur, Long>{

}
