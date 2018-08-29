package com.agroAppli.consoLocal.modele;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data_categorie_produit")
public class CategorieProduit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 560731210893446551L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="data_categorie_produit_code")
	private String codeCategorie;

	@Column(name="data_categorie_produit_libelle", nullable=false)
	private String libelleCategorie;

	public CategorieProduit(){

	}
	public String getCodeCategorie() {
		return codeCategorie;
	}
	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}
	public String getLibelleCategorie() {
		return libelleCategorie;
	}
	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}




}



