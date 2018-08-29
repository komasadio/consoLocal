package com.agroAppli.consoLocal.modele;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="data_produit")
public class Produit implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6704426376395257649L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="data_produit_id")
	private Long id;
	
	@Column(name="data_produit_libelle", nullable=false)
	private String libelle;
	
	@Column(name="data_produit_prix")
	private Double prix;
	
	@Column(name="data_produit_quantite")
	private int quantite;
	
	@ManyToOne
	private CategorieProduit categorieProduit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	

}
