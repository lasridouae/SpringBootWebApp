package com.spring.springApp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produit implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduit;
    private String produitName;
    private String description;
    private float prix;
    private int quantite;

    @JsonIgnore
    private float prixAchat;
    

	public Produit() {
		super();
	}

	public Produit(String produitName, String description, float prix, float prixAchat, int quantite) {
		super();
		this.produitName = produitName;
		this.description = description;
		this.prix = prix;
		this.prixAchat = prixAchat;
		this.quantite = quantite;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getProduitName() {
		return produitName;
	}

	public void setProduitName(String produitName) {
		this.produitName = produitName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	
	public float getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}


	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	
    
	

  
}