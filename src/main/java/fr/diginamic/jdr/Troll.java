package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {

	public Troll() {
		
		int randomForce = new Random().nextInt(5) + 10;
		setForce(randomForce);
		
		int randomVie = new Random().nextInt(10) + 20;
		setPointDeVie(randomVie);
		
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Loup";
	}


}
