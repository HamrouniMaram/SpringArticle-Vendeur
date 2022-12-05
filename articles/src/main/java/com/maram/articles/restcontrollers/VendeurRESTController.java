package com.maram.articles.restcontrollers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maram.articles.entities.Vendeur;
import com.maram.articles.repos.VendeurRepository;

@RestController
@RequestMapping("/api/ven")
@CrossOrigin("*")

public class VendeurRESTController {
	@Autowired
	VendeurRepository vendeurRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Vendeur> getAllVendeurs()
	{
	return vendeurRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Vendeur getVendeurById(@PathVariable("id") Long id) {
	return vendeurRepository.findById(id).get();
	}

}
