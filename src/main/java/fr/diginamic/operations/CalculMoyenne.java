package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	double[] tab;

	public CalculMoyenne() {
		super();
		this.tab = new double[0];
	}

	//ajouter un double au tableau
	public void ajout(double a){
		
		double[] tabCopie = new double[tab.length+1];
		
		for (int i=0;i<tab.length;i++){
			tabCopie[i] = tab[i];
		}

		//ajouter le double dans le tableau tabCopie
		tabCopie[tabCopie.length-1] = a;
		//mettre a jour le tableau tab a partir de la copie
		tab = Arrays.copyOf(tabCopie, tabCopie.length);

	}
	
	public double calculMoyenne(){
		
		double moyenne=0;
		double somme = 0;
		
		for (int i=0;i<tab.length;i++){
			somme = somme+tab[i];
		}
		
		moyenne = somme/tab.length;
		moyenne = Math.round(moyenne*100.00)/100.00;
		
		return moyenne;
	}
	
	
	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}
	
	
	
}
