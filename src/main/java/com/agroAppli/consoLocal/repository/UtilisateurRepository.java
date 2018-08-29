package com.agroAppli.consoLocal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agroAppli.consoLocal.modele.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	
	Utilisateur getUtilisateurByEmail(String email);

}
