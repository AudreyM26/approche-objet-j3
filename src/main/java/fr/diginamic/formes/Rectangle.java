package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;

	//retourne calcul du perimetre d un cercle
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	//retourne calcul de la surface d un rectangle
	public double calculerSurface() {
		
		return Math.round((longueur*largeur)*100.00)/100.00;
	}

	//retourne calcul du perimetre d un rectangle
	public double calculerPerimetre() {
		
		return Math.round(((longueur+largeur)*2)*100.00)/100.00;
	}

	//redefinir toString pour afficher le perimetre et surface du rectangle
	public String toString(){
		String texte = "Rectangle de "+longueur+" x "+largeur+"\nPérimètre = "+calculerPerimetre()+"\nSurface = "+calculerSurface()+"\n";
		return texte;
	}
}
