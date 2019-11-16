package fr.diginamic.formes;

public class Cercle extends Forme {

	double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	//retourne calcul de la surface d un cercle
	public double calculerSurface() {

		return Math.round((Math.PI*Math.pow(rayon,2))*100.00)/100.00;
	}

	//retourne calcul du perimetre d un cercle
	public double calculerPerimetre() {

		return Math.round((2*Math.PI*rayon)*100.00)/100.00;
	}

	//redefinir toString pour afficher le perimetre et surface du cercle
	public String toString(){
		String texte = "Cercle de rayon:"+rayon+" \nPérimètre = "+calculerPerimetre()+"\nSurface = "+calculerSurface()+"\n";
		return texte;
	}
}
