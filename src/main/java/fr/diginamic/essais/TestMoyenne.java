package fr.diginamic.essais;

import fr.diginamic.operations.*;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne tabCalcul = new CalculMoyenne();
		
		tabCalcul.ajout(14);
		tabCalcul.ajout(12);
		tabCalcul.ajout(15.9);
		tabCalcul.ajout(14.2);
		
		double moyenne = tabCalcul.calculMoyenne();
		System.out.println("La moyenne du tableau : "+moyenne);

		tabCalcul.ajout(18);
		tabCalcul.ajout(11.5);
		
		moyenne = tabCalcul.calculMoyenne();
		System.out.println("Nouvelle moyenne du tableau : "+moyenne);
	}

}
