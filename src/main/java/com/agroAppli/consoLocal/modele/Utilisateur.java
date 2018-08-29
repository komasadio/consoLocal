package com.agroAppli.consoLocal.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data_utilisateur")
public class Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3824325747775711949L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="identifiant_utilisateur")
	private Long id;
	
	@Column(name="nom_utilisateur", nullable=false)
	private String nom;
	
	@Column(name="prenom_utilisateur", nullable=false)
	private String prenom;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="login",nullable=false)
	private String login;
	
	@Column(name="password",nullable=false)
	private String password;
	
	
	public Utilisateur() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String motDePasse) {
		this.password = motDePasse;
	}
	
}

