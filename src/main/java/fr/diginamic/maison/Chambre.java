package fr.diginamic.maison;

public class Chambre extends Piece {

	public Chambre(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	//retourne type de piece
	public String getType() {
		
		return "Chambre";
	}

}
