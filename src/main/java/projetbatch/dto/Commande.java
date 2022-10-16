package projetbatch.dto;

import java.util.Date;

public class Commande {

	private int id;
	private String nom;
	private String prenom;
	
	private Date date;
	private String produit;
	private double montant;
	private String statut;
	
	public Commande() {}
	
	public Commande(int id, String nom, String prenom, Date date, String produit, double montant, String statut) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.produit = produit;
		this.montant = montant;
		this.statut = statut;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProduit() {
		return produit;
	}
	public void setProduit(String produit) {
		this.produit = produit;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
}
