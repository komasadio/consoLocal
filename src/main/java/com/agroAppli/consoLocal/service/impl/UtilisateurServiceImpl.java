package com.agroAppli.consoLocal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroAppli.consoLocal.modele.Utilisateur;
import com.agroAppli.consoLocal.repository.UtilisateurRepository;
import com.agroAppli.consoLocal.service.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur getUtilisateurByEmail(String email) {
		return utilisateurRepository.getUtilisateurByEmail(email);
		
	}

}
