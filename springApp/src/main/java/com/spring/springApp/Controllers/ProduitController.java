package com.spring.springApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springApp.models.Produit;
import com.spring.springApp.services.ProduitService;

//mark class as Controller  
@RestController
public class ProduitController {
	
	// Autowire the ProduitService class
	@Autowired
	ProduitService produitService;

	// creating a get mapping that retrieves all the products detail from the database
	@GetMapping("/produit")
	private List<Produit> getAllproduit() {
		return produitService.getAllProduit();
	}

	// creating a get mapping that retrieves the detail of a specific product 
	@GetMapping("/produit/{idProduit}")
	private Produit getproduit(@PathVariable("idProduit") Long idProduit) {
		return produitService.getProduitById(idProduit);
	}

	// creating a delete mapping that deletes a specified product 
	@DeleteMapping("/produit/{idProduit}")
	private void deleteproduit(@PathVariable("idProduit") Long idProduit) {
		produitService.delete(idProduit);
	}

	// creating post mapping that post the product detail in the database
	@PostMapping("/produits")
	private Long saveproduit(@RequestBody Produit produits) {
		produitService.saveOrUpdate(produits);
		return produits.getIdProduit();
	}

	// creating put mapping that updates the product  detail
	@PutMapping("/produits")
	private Produit update(@RequestBody Produit produits) {
		produitService.saveOrUpdate(produits);
		return produits;
	}
}
