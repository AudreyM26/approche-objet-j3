package fr.diginamic.chaines;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		System.out.println("Taille de la chaine: "+chaine.length());
		
		System.out.println("Index du premier ';' : "+chaine.indexOf(';'));
		
		String nomFamille = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("Nom de famille: "+nomFamille);
	
		System.out.println("Nom de famille en majuscule: "+nomFamille.toUpperCase());
		
		System.out.println("Nom de famille en minuscule: "+nomFamille.toLowerCase());
		
		String[] tab = chaine.split(";");
		
		for (int i=0;i<tab.length;i++){
			System.out.println(i+" -> "+tab[i]);
		}
		
		Personne p = new Personne(tab[0],tab[1]);
		p.AfficheNomPrenom();
		
		
		double salaire = Double.parseDouble(tab[3].replace(" ", ""));
		int numeroClient = Integer.parseInt(tab[2]);
		
		Compte c = new Compte (numeroClient,salaire);
		System.out.println(c);
	}
	
}
