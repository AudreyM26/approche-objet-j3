package fr.diginamic.formes;

public class Carre extends Rectangle {

	private double longueurs;
	
	public Carre(double longueurs) {
		super(longueurs, longueurs);
	
	}
	
	//redefinir toString pour afficher le perimetre et surface du cercle
	public String toString(){
		String texte = super.toString();
		texte = texte.replace("Rectangle", "Carré");
		return texte;
	}
}
