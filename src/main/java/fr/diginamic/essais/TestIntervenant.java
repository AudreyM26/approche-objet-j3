package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intervenant pers1 = new Salarie("Dupond","Emile",1523.58);
		Intervenant pers2 = new Pigiste("Lopez","Julia",20,120);
				
		//System.out.println(pers1.getSalaire());
		//System.out.println(pers2.getSalaire());
		
		pers1.afficherDonnees();
		pers2.afficherDonnees();
		
	}

}
