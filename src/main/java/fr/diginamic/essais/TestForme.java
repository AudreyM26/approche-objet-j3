package fr.diginamic.essais;
import fr.diginamic.formes.*;


public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Forme cerc = new Cercle(4);
		Forme rect = new Rectangle(14,6);
		Forme carr = new Carre(8);

		AffichageForme a = new AffichageForme();

		a.afficher(cerc);
		a.afficher(rect);
		a.afficher(carr);
	}

}
