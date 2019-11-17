package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature {

	public Gobelin() {
		
		int randomForce = new Random().nextInt(5) + 5;
		setForce(randomForce);
		
		int randomVie = new Random().nextInt(5) + 10;
		setPointDeVie(randomVie);
		
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Gobelin";
	}


}
