package org.miage.sid.dao;

import java.util.List;

import org.miage.sid.enties.Produit;

public interface ICatalogueDAO {
	
	public void addProduit(Produit p);
	
	public List<Produit> getAllProduit();
	
	public List<Produit> produitParmc(String mc);
	
	public Produit getProduit(String ref);
	
	public void deletePrduit(String ref);
	
	public void updateProduit(Produit p);

}
