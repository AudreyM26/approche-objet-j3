package fr.diginamic.maison;

import static org.junit.Assert.*;

import org.junit.Test;


public class MaisonTest {

	@Test
	public void testMaison() {
		Maison m =new Maison();
		
		Chambre ch1 = new Chambre(11.56,0);
		m.ajouterPiece(ch1);
		
		// Normalement la méthode doit retournée true
		assertEquals(1,m.getTabPieces().length);
	}
	
	@Test
	public void testAjouterPiece1() {
		Maison m =new Maison();
		
		Chambre ch1 = new Chambre(-11.56,0);
		m.ajouterPiece(ch1);

		assertEquals(0,m.getTabPieces().length);
	}
	
	@Test
	public void testAjouterPiece2() {
		Maison m =new Maison();
		
		Chambre ch1 = new Chambre(11.56,-1);
		m.ajouterPiece(ch1);

		assertEquals(0,m.getTabPieces().length);
	}
	
	@Test
	public void testAjouterPiece3() {
		Maison m =new Maison();
		
		Chambre ch1 = new Chambre(11.56,1);
		m.ajouterPiece(ch1);

		assertEquals(1,m.getTabPieces().length);
	}
	

	@Test
	public void testAjouterPieceNull() {
		Maison m =new Maison();
		
		Chambre ch1 = null;
		m.ajouterPiece(ch1);

		assertEquals(0,m.getTabPieces().length);
	}
	
	@Test
	public void testCalculerSuperficie() {
		
		Maison m =new Maison();
		Chambre ch1 = new Chambre(11.56,0);
		m.ajouterPiece(ch1);
		
		Chambre ch2 = new Chambre(11.39,1);
		m.ajouterPiece(ch2);
	
		assertEquals(0.00001,22.95,m.superficieTotale());

	}
	
	
	@Test
	public void testsuperficieEtage(){
		Maison m =new Maison();
		Chambre ch1 = new Chambre(11.56,0);
		m.ajouterPiece(ch1);
		
		Chambre ch2 = new Chambre(11.39,1);
		m.ajouterPiece(ch2);
		
		Salon s = new Salon(43.23,0);
		m.ajouterPiece(s);

		assertEquals(0.00001,54.79,m.superficieEtage(0));
	}
	
	@Test
	public void testsuperficieType(){
		Maison m =new Maison();
		Chambre ch1 = new Chambre(11.56,0);
		m.ajouterPiece(ch1);
		
		Chambre ch2 = new Chambre(11.39,1);
		m.ajouterPiece(ch2);
		
		Salon s = new Salon(43.23,0);
		m.ajouterPiece(s);

		assertEquals(0.00001,22.95,m.superficieType("Chambre"));
	}
	
}
