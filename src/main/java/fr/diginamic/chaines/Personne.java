package fr.diginamic.chaines;

public class Personne {

	public String nom;
	public String prenom;

	public Personne(String pNom,String pPrenom){
		
		this.nom = pNom;
		this.prenom = pPrenom;
	}
	
	
	public void AfficheNomPrenom() {
		System.out.println(this.nom.toUpperCase()+" "+this.prenom);
	
	}
	
	public void ModifNom(String newNom) {
		this.nom = newNom;
	}
	
	public void ModifPrenom(String newPrenom) {
		this.prenom = newPrenom;
	}
	
	
	
	public String getNom (String pNom) {
		return pNom;
	}
	
	public String getPrenom (String pPrenom) {
		return pPrenom;
	}
}
