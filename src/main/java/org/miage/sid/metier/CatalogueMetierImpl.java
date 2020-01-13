package org.miage.sid.metier;

import java.util.List;

import org.miage.sid.dao.ICatalogueDAO;
import org.miage.sid.enties.Produit;

public class CatalogueMetierImpl implements IcatalogueMetier{
	private ICatalogueDAO dao;
	//setter pour injection de dependance.
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}


	@Override
	public void addProduit(Produit p) {

		dao.addProduit(p);
	}

	@Override
	public List<Produit> getAllProduit() {
		return dao.getAllProduit();
	}

	@Override
	public List<Produit> produitParmc(String mc) {
		// TODO Auto-generated method stub
		return dao.produitParmc(mc);
	}

	@Override
	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return dao.getProduit(ref);
	}

	@Override
	public void deletePrduit(String ref) {

		dao.deletePrduit(ref);
	}

	@Override
	public void updateProduit(Produit p) {

		dao.updateProduit(p);
	}

}
