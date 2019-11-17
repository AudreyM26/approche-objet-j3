package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature {

	public Loup() {
		
		int randomForce = new Random().nextInt(6) + 3;
		setForce(randomForce);
		
		int randomVie = new Random().nextInt(5) + 5;
		setPointDeVie(randomVie);
		
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Loup";
	}

	/*
	public String toString(){
		String texte = super.toString();
		texte = this.getType()+"tttt";
		
		return texte;
	} */
}
