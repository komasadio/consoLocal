package com.agroAppli.consoLocal.service;

import com.agroAppli.consoLocal.modele.Utilisateur;

public interface UtilisateurService {
	
	Utilisateur getUtilisateurByEmail(String email);

}
