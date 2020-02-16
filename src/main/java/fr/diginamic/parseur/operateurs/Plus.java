package fr.diginamic.parseur.operateurs;

import fr.diginamic.parseur.membres.Membre;

/** Représente l'opérateur "+" dont l'évaluation est une addition entre les membres gauche et droit
 * @author DIGINAMIC
 *
 */
public class Plus extends Operateur {
	
	@Override
	public String getNom() {
		return "+";
	}

	@Override
	public double evaluer(String nomVariable, Double valeur, Membre gauche, Membre droit){
		return gauche.evaluer(nomVariable, valeur) + droit.evaluer(nomVariable, valeur);
	}
}
