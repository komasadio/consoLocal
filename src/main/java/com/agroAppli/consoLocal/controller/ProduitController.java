package com.agroAppli.consoLocal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroAppli.consoLocal.dto.CategorieProduitDto;
import com.agroAppli.consoLocal.mappers.CategoryProduitMapper;
import com.agroAppli.consoLocal.modele.CategorieProduit;
import com.agroAppli.consoLocal.service.CategorieProduitService;

@RestController
public class ProduitController {
	@Autowired
	private CategorieProduitService categorieProduitService;
	
	//@Autowired
	//private CategoryProduitMapper categorieProduitMapper;
	
//private static final Logger logger = LoggerFactory.getLogger(RestServices.class);
    
    @GetMapping(value = "/")
    public ResponseEntity<String> pong() 
    {
        //logger.info("Démarrage des services OK .....");
        return new ResponseEntity<String>("Réponse du serveur: "+HttpStatus.OK.name(), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET, value="/category", produces="application/json")
	public List<CategorieProduit> getListeCategorieProduit(){
		return categorieProduitService.getListeCategorieProduit();
		
	}


}
