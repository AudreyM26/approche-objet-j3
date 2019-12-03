package fr.diginamic.jdr;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TestJeuDeRole {

	public static Personnage perso = new Personnage("");
	public static Scanner saisiePerso = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Afficher le menu
		AfficheMenuChoix();
		
		int choix = 0;	
		boolean erreur;
	
		while(choix != 99){
			//Bloc d'essai pour s'assurer qu'on récupère bien un entier
			do {
				try {
					
	        		System.out.println("Veuillez saisir votre choix : ");
	        		choix = saisiePerso.nextInt();
	                erreur = false;
	                
	                //afficher choix du joueur
	                AfficheChoixJoueur(choix);
	                //afficher le menu principal de jeu
	                if(choix !=99){
	                	AfficheMenuChoix();
	                }
	               
	                
				} catch (InputMismatchException e) {
	            	System.out.println("\nCe n'est pas une valeur prise en charge, veuillez réessayer.");
	                erreur = true;
	                saisiePerso.next();
	            }
	        } while (erreur);
		}
		
		saisiePerso.close();
		
		
	}

	
	//affiche le menu principal du jeu
	public static void AfficheMenuChoix(){
		
		System.out.println("***** MENU *****");	
		if(perso.getNom().equals("")){
			System.out.println("1. Créer un personnage");
		}else{
			System.out.println("1. Afficher son personnage");
		}
			
		System.out.println("2. Combattre une créature");	
		System.out.println("3. Afficher le score");	
		System.out.println("99. Sortir\n");
	}
	
	public static void AfficheChoixJoueur(int pChoix){
		
		switch (pChoix){
		
			case 1 :
				//creation du personnage, saisir son nom
				if(perso.getNom().equals("")){
					System.out.println("Veuillez saisir un nom à votre personnage");
					perso.setNom(saisiePerso.next());
					
				}
				
				//affichage du personnage : nom, force et vie
				System.out.println(perso);
				break;
				
			case 2 :
				//si le nom du personnage non saisin=, afficher cas 1
				if(perso.getNom().equals("")){
					AfficheChoixJoueur(1);
				}else{
					
					//Combattre la creature
					if(perso.getPointDeVie() > 0){
				
						//selection aleatoire de la creature à combattre	
						Creature creatureCombat = selectionCreatureRandom();
						System.out.println("Créature à combattre:");
						System.err.println(creatureCombat);
						//Tour de jeu
						RegleTour(creatureCombat);
						
					}else{
						System.out.println("Votre personnage est décédé. Il a obtenu le score de "+perso.getScore()+" points. Veuillez créer un nouveau personnage");
						perso.setNom("");
						perso.setForce((new Random().nextInt(6) + 12));
						perso.setPointDeVie((new Random().nextInt(30) + 20));
					}
				}
				break;
				
				case 3:
					//afficher le score
					System.out.println("Votre score est de : "+perso.getScore()+" points.");
					break;
				
				default:
					System.out.println("Au revoir");
					break;
		}
	}
	
	
	public static Creature selectionCreatureRandom(){ 
		
		int randomCreature = new Random().nextInt(3);
		Creature crea = null;
		
		switch (randomCreature){
			case 0:
				crea =new Loup();
				break;
				
			case 1:
				crea =new Gobelin();
				break;
				
			default:
				crea =new Troll();
				break;
				
		}
		
		return crea;
	}
	
	public static void RegleTour(Creature pCreaCombat){
		
		while(perso.getPointDeVie()>0 && pCreaCombat.getPointDeVie()>0){
			int forcePerso = perso.getForce()+(new Random().nextInt(9)+1);
			int forceCreature = perso.getForce()+(new Random().nextInt(9)+1);
			int viePerdant=0;
			
			//si egalité aucun dégats des 2 cotés
			if(forcePerso == forceCreature){
				System.out.println("Aucun dégat pour les 2 parties.\n");
				
			}else{
				//si la force du perso supérieure à celle de la créature
				if(forcePerso > forceCreature){
					
					viePerdant = pCreaCombat.getPointDeVie();
					pCreaCombat.setPointDeVie(viePerdant-(forcePerso-forceCreature));
					System.out.println("Vous avez remporté ce tour avec une force de "+forcePerso+" contre "+forceCreature+" pour le "+pCreaCombat.getType()+"\n");
					System.out.println(pCreaCombat);
				}else{
					viePerdant = perso.getPointDeVie();
					perso.setPointDeVie(viePerdant-(forceCreature-forcePerso));
					System.out.println(pCreaCombat.getType()+" a remporté ce tour avec une force de "+forceCreature+" contre "+forcePerso+" pour vous.\n");
					System.out.println(perso);
				}
				
			}
			
		}
		
		if(perso.getPointDeVie()> 0){
			System.out.println("Félicitations, vous avez gagné ce combat.\n");
			
			int scoreCalcul=0;
			
			if(pCreaCombat.getType().equals("Loup")){
				scoreCalcul = perso.getScore()+1;
			}
			
			if(pCreaCombat.getType().equals("Gobelin")){
				scoreCalcul = perso.getScore()+2;
			}
			
			if(pCreaCombat.getType().equals("Troll")){
				scoreCalcul = perso.getScore()+5;
			}
			
			perso.setScore(scoreCalcul);
			System.out.println(perso);
			
		}else{
			System.out.println("Vouas avez perdu ce combat.");
			System.out.println("Votre score est de "+perso.getScore()+"\n");
		}
		
		
	}

}
