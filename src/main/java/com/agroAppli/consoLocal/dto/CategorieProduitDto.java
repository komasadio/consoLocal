package com.agroAppli.consoLocal.dto;

import java.io.Serializable;

public class CategorieProduitDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5287309855066221430L;
	
	private String codeCategorie;
	
	private String libelleCategorie;
	
	public CategorieProduitDto(){
		
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

