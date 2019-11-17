package fr.diginamic.jdr;

public abstract class Creature {

	private int force;
	private int pointDeVie;
	//private String nom;
	
	public abstract String getType();
	
	
	public int getForce() {
		return force;
	}



	public void setForce(int force) {
		this.force = force;
	}


	public int getPointDeVie() {
		return pointDeVie;
	}


	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	
	//redefinir toString pour afficher la force et la vie
	public String toString(){
		String texte = this.getType()+"\nForce : "+this.force+"\nPoint de Vie = "+this.pointDeVie+"\n";
		return texte;
	}
}
