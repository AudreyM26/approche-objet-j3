package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int nbreJours;
	double montantJours;
	
	public Pigiste(String pNom, String pPrenom, int pNbreJours, double pMontantJours) {
		super(pNom, pPrenom);
		this.nbreJours = pNbreJours;
		this.montantJours = pMontantJours;
	}

	//retourne le salaire 
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbreJours*montantJours;
	}

	//retourne le statut
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}

}
