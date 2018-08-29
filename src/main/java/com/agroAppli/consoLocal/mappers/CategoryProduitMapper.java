package com.agroAppli.consoLocal.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.agroAppli.consoLocal.dto.CategorieProduitDto;
import com.agroAppli.consoLocal.modele.CategorieProduit;

@Mapper
public abstract class CategoryProduitMapper {

	public abstract  CategorieProduitDto map(CategorieProduit categoryProduit);

	public abstract List<CategorieProduitDto> map(List<CategorieProduit> categoryProduit);

}
