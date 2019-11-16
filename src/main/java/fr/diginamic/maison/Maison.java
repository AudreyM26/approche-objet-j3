package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	private Piece[] tabPieces;
	
	public Maison() {
		tabPieces = new Piece[0];
	}
	
	//ajouter une pièce dans le tableau
	public void ajouterPiece(Piece newPiece){
	
		if(newPiece == null || newPiece.getEtage() < 0 || newPiece.getSuperficie() <0){
			System.out.println("Veuillez rentrer une pièce avec des données cohérentes");
			
		}else{
			Piece[] tabPiecesCopie = new Piece[tabPieces.length+1];
			
			
			for (int i=0;i<tabPieces.length;i++){
				tabPiecesCopie[i] = tabPieces[i];
			}

			//ajouter l operation dans le tableau copie tabPiecesCopie
			tabPiecesCopie[tabPiecesCopie.length-1] = newPiece;
			//mettre a jour le tableau comptes a partir de la copie
			tabPieces = tabPiecesCopie;
		}
		
		
		
	}
	
	//retourne la superficie totale
	public double superficieTotale(){
		
		double result=0;
		
		for (int i=0;i<tabPieces.length;i++){
			result = result + tabPieces[i].getSuperficie();
		}
		result = Math.round(result*100.00)/100.00;
		return result;
	}
	
	//retourne superficie d un etage saisi
	public double superficieEtage(int pEtage){
		
		double result=0;
		
		for (int i=0;i<tabPieces.length;i++){
			
			if(tabPieces[i].getEtage() == pEtage){
				result = result + tabPieces[i].getSuperficie();
			}
		}
		result = Math.round(result*100.00)/100.00;
		return result;
	}
	
	//retourne superficie totale d un type de pieces
	public double superficieType(String pType){
		
		double result=0;
		
		for (int i=0;i<tabPieces.length;i++){
			
			if(tabPieces[i].getType() == pType){
				result = result + tabPieces[i].getSuperficie();
			}
		}
		
		result = Math.round(result*100.00)/100.00;
		return result;
	}
	
	
	//retourne nombre de pieces selon le type
	public int getNombrePieces(String pType){
		
		int cpte=0;
	
		for (int i=0;i<tabPieces.length;i++){
			
			if(tabPieces[i].getType() == pType){
				cpte +=1;
			}
		}
		
		return cpte;
	}
}
