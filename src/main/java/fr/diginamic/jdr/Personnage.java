package fr.diginamic.jdr;

import java.util.Random;

public class Personnage extends Creature{

	private int score;
	private String nom;
	
	public Personnage(String pNom) {
		
		int randomForce = new Random().nextInt(6) + 12;
		setForce(randomForce);
		
		int randomVie = new Random().nextInt(30) + 20;
		setPointDeVie(randomVie);
		this.nom = pNom;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return this.getNom();
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	public String toString(){
		String texte = this.getType();
		texte = super.toString();
		if(this.getScore()>0){
			texte = texte+"Score :"+this.getScore()+"\n";
		}
		return texte;
	} 

}
