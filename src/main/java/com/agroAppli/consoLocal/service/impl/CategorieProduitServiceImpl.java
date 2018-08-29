package com.agroAppli.consoLocal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroAppli.consoLocal.modele.CategorieProduit;
import com.agroAppli.consoLocal.repository.CategorieProduitRepository;
import com.agroAppli.consoLocal.service.CategorieProduitService;

@Service
public class CategorieProduitServiceImpl implements CategorieProduitService{
	@Autowired
	private CategorieProduitRepository categoryProduitRepository;

	@Override
	public List<CategorieProduit> getListeCategorieProduit() {
		return (List<CategorieProduit>) categoryProduitRepository.findAll();
	}

}
