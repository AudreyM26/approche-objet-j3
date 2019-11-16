package fr.diginamic.essais;


import fr.diginamic.entites.*;

import fr.diginamic.utils.*;

public class TestCercle {

	public static void main(String[] args) {
		
		//Instancier 2 cercles avec classe Cercle
		Cercle[] tabCercle = new Cercle[2];
		
		tabCercle[0] = new Cercle(5);
		tabCercle[1] = new Cercle(8);
		
		for (int i=0;i<tabCercle.length;i++){
			System.out.println(tabCercle[i]);
		}
		
		//creer cercle avec classe CercleFactory
		Cercle[] tabCercleFact = new Cercle[2];
		tabCercleFact[0] = CercleFactory.creerCercle(6);
		tabCercleFact[1] = CercleFactory.creerCercle(4);
		
		for (int i=0;i<tabCercleFact.length;i++){
			System.out.println(tabCercleFact[i]);
		}

	}
}
