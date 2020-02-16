package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaire;
	
	public Salarie(String pNom, String pPrenom, double pSalaire) {
		super(pNom, pPrenom);
		this.salaire = pSalaire;
		// TODO Auto-generated constructor stub
	}

	//retourne le salaire 
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.salaire;
	}

	//retourne le statut
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Salarié";
	}

}
