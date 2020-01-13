package org.miage.sid.enties;

import java.io.Serializable;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Produit implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@NotEmpty
	@Size(min=4,max=12)
	private String reference;
	@NotEmpty
	private String designation;
	@DecimalMin(value="100")
	private double prix;
	private int quantite;
	public Produit() {
		super();
	}
	
	public Produit(String reference, String designation, double prix, int quantite) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}

	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", designation=" + designation + ", prix=" + prix + ", quantite="
				+ quantite + "]";
	}
	
}
