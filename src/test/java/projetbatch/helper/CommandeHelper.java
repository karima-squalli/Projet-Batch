package projetbatch.helper;

import java.util.Date;

import projetbatch.dto.Commande;

public class CommandeHelper {

	public static Commande getCommande() {
		
		Commande commande = new Commande();
		commande.setId(1);
		commande.setNom("toto");
		commande.setPrenom("tata");
		commande.setDate(new Date(0));
		commande.setMontant(1000.00);
		commande.setProduit("PROD");
		commande.setStatut("en cours");
		
		return commande;
	}
	
public static Commande getCommandeConstructor() {
		
		Commande commande = new Commande(1, "toto", "tata", new Date(0), "PROD", 1000.00, "en cours");
		
		return commande;
	}
	
}
