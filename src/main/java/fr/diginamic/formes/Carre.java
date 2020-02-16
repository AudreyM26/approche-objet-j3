package fr.diginamic.formes;

public class Carre extends Rectangle {


	public Carre(double longueur) {
		super(longueur, longueur);
	
	}
	
	//redefinir toString pour afficher le perimetre et surface du cercle
	public String toString(){
		String texte = super.toString();
		texte = texte.replace("Rectangle", "Carré");
		return texte;
	}
}
