package projetbatch.dto;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.Test;

import projetbatch.helper.CommandeHelper;

public class CommandeTest {
	
	@Test
	public void getCommandeTest() {
		Commande expectedCommande = CommandeHelper.getCommande();
		
		assertEquals(expectedCommande.getId(), 1);
		assertEquals(expectedCommande.getNom(), "toto");
		assertEquals(expectedCommande.getPrénom(), "tata");
		assertEquals(expectedCommande.getDate(), new Date(0));
		assertEquals(expectedCommande.getMontant(), 1000.00, 0.01);
		assertEquals(expectedCommande.getProduit(), "PROD");
		assertEquals(expectedCommande.getStatut(), "en cours");
	}
	
	@Test
	public void getCommandeConstructorTest() {
		Commande expectedCommande = CommandeHelper.getCommandeConstructor();
		
		assertEquals(expectedCommande.getId(), 1);
		assertEquals(expectedCommande.getNom(), "toto");
		assertEquals(expectedCommande.getPrénom(), "tata");
		assertEquals(expectedCommande.getDate(), new Date(0));
		assertEquals(expectedCommande.getMontant(), 1000.00, 0.01);
		assertEquals(expectedCommande.getProduit(), "PROD");
		assertEquals(expectedCommande.getStatut(), "en cours");
	}
}
