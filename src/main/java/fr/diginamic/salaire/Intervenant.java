package fr.diginamic.salaire;

public abstract class Intervenant {

	
	String nom;
	String prenom;
	
	public Intervenant(String pNom,String pPrenom) {
		// TODO Auto-generated constructor stub
		this.nom = pNom;
		this.prenom = pPrenom;
	}

	public abstract double getSalaire();
	public abstract String getStatut();
	
	public void afficherDonnees(){
		
		System.out.println(nom+" "+prenom+" - salaire : "+getSalaire()+"€ - statut : "+getStatut());
	}
	
}
