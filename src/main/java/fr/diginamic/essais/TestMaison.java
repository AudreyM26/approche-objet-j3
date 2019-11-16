package fr.diginamic.essais;
import fr.diginamic.maison.*;


public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maison mais1 = new Maison();
		
		mais1.ajouterPiece(new Chambre(11.56,0));
		mais1.ajouterPiece(new SalleDeBain(4.72,0));
		mais1.ajouterPiece(new WC(1.32,0));
		mais1.ajouterPiece(new Cuisine(9.07,0));
		mais1.ajouterPiece(new Salon(33.06,0));
		
		mais1.ajouterPiece(new Chambre(11.39,1));
		mais1.ajouterPiece(new Chambre(17.59,1));
		mais1.ajouterPiece(new SalleDeBain(4.40,1));
		mais1.ajouterPiece(new WC(1.32,1));
		
		mais1.ajouterPiece(null);
		mais1.ajouterPiece(new WC(-1.32,1));
		mais1.ajouterPiece(new WC(-1.32,-1));
		
		System.out.println("superficie totale : "+mais1.superficieTotale());
		
		System.out.println("superficie etage 0 : "+mais1.superficieEtage(0));
		System.out.println("superficie etage 1 : "+mais1.superficieEtage(1));
		
		System.out.println("superficie totale des chambres : "+mais1.superficieType("Chambre"));
		System.out.println("nombre total des chambres : "+mais1.getNombrePieces("Chambre"));
		System.out.println("nombre total des salles de bain : "+mais1.getNombrePieces("SalleDeBain"));
		
	}

}
