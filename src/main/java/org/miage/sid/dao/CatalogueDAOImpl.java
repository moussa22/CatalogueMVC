package org.miage.sid.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.miage.sid.enties.Produit;


public class CatalogueDAOImpl implements ICatalogueDAO{
	Map<String, Produit> produits=new HashMap<String, Produit>();
	Logger logger=Logger.getLogger(CatalogueDAOImpl.class);

	@Override
	public void addProduit(Produit p) {
		
		produits.put(p.getReference(), p);
		
	}

	@Override
	public List<Produit> getAllProduit() {
		Collection<Produit> prods=produits.values();
		return new ArrayList<Produit>(prods);
	}

	@Override
	public List<Produit> produitParmc(String mc) {
		
		List<Produit> prodmc=new ArrayList<Produit>();
		for(Produit p:produits.values())
			 if(p.getDesignation().indexOf(mc)>0)
				 prodmc.add(p);
		return prodmc;
	}

	@Override
	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return produits.get(ref);
	}

	@Override
	public void deletePrduit(String ref) {

		produits.remove(ref);
	}

	@Override
	public void updateProduit(Produit p) {
		produits.put(p.getReference(), p);
		
	}
	
	public void init() {
		
		logger.info("Initialisation du catalogue");
		
		addProduit(new Produit("HP654","Ordinateur HP654", 8000 ,12));
		
		addProduit(new Produit("HP655","Television HP654", 9003 ,11));
		
		addProduit(new Produit("HP656","Frigo HP655", 9000 ,14));
		
	
		
		
		
	}
	
	

}
