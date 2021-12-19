import java.util.Random;

import java.util.Scanner;

import animals.Animal;
import controller.*;
import controller.Controller;
import employee.Gender;
import enclosure.Aviary;
import enclosure.Enclosure;
import zoo.Zoo;

/**
 * @author Guilhem
 *Main class
 */
public class Main {
	/**
	 * @param args
	 * @throws InterruptedException
	 * start of the program
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Controller controller = null;
		Data data = new Data();
		
		boolean ans = true;
		
		
		while(ans) {
			if(controller==null) {
				//Récup valeur zoo
				System.out.println("Nouvelle partie de Zoo ! ");

				
				data.createZoo();
				controller = data.getController();
				
				controller.getZoo().getClock().subscribe("starve",controller );
				controller.getZoo().getClock().subscribe("tired",controller );
				controller.getZoo().getClock().subscribe("sickness",controller );
				controller.getZoo().getClock().subscribe("baby",controller );
				controller.getZoo().getClock().subscribe("makeSound",controller );
				
				controller.getZoo().getEnclosureClock().subscribe("cleanliness",controller );
				
	
				
				controller.getZoo().startSimulation();
				
			}else {
				System.out.println("Deux jetons");
				
				int jeton =2;
				while(jeton>0) {
					controller.getZoo().displayEnclosuresAndAnimals();
					
					System.out.println("" );
					System.out.println("Votre nombre actions restantes : " + jeton + ". Attention toute action incorrecte sera considéré comme ne rien faire" );
					
					System.out.println("1 :  pour nettoyer un enclos" );
					System.out.println("2 :  pour nourrir les animaux d'un enclos" );
					System.out.println("3 :  pour reveiller un animal" );
					System.out.println("4 :  pour soigner un animal" );
					System.out.println("5 :  pour transférer un animal" );
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Veuillez saisir un nombre :");
					int choice = sc.nextInt();
					
					
					
					
					
					switch(choice){

			        case 1: 
			        	controller.getZoo().displayEnclosures();
			        	
						Scanner scCaseOne = new Scanner(System.in);
			        	System.out.println("Veuillez saisir quel enclos vous voulez nettoyer : (tapez l'index) ");
			        	int choiceCaseOne = sc.nextInt();
			        	Enclosure enclosureToCheck = controller.getZoo().researchEnclosure(choiceCaseOne);
			        	controller.checkAndCleanEnclosure(enclosureToCheck);
			            break;

			        case 2:
			        	
			        	controller.getZoo().displayEnclosures();
			        	
						Scanner scCaseTwo = new Scanner(System.in);
			        	System.out.println("Veuillez saisir quel enclos vous voulez nourrir : (tapez l'index) ");
			        	int choiceCaseTwo = sc.nextInt();
			        	Enclosure enclosureToFeed = controller.getZoo().researchEnclosure(choiceCaseTwo);
			        	controller.feedThemAll(enclosureToFeed);
			            break;
			        case 3:
			        	controller.getZoo().displayEnclosures();
			        	
						Scanner scCaseFour = new Scanner(System.in);
			        	System.out.println("Veuillez saisir quel enclos vous voulez regarder : (tapez l'index) ");
			        	int choiceCaseFour = scCaseFour.nextInt();
			        	Enclosure enclosureToWatch = controller.getZoo().researchEnclosure(choiceCaseFour);
			        	System.out.println("" );
			        	enclosureToWatch.displayAnimals();
			        	System.out.println("" );
			        	System.out.println("Veuillez saisir quel animal vous voulez réveiller : (tapez l'index) ");
			        	choiceCaseFour = scCaseFour.nextInt();
			        	Animal animalToHealth = enclosureToWatch.researchAnimal(choiceCaseFour);
			        	controller.getZoo().getWorker().wakeUp(animalToHealth);
			        	
			        	break;
			        case 4:
			        	controller.getZoo().displayEnclosures();
			        	
						Scanner scCaseThree = new Scanner(System.in);
			        	System.out.println("Veuillez saisir quel enclos vous voulez regarder : (tapez l'index) ");
			        	int choiceCaseThree = scCaseThree.nextInt();
			        	enclosureToWatch = controller.getZoo().researchEnclosure(choiceCaseThree);
			        	System.out.println("" );
			        	enclosureToWatch.displayAnimals();
			        	System.out.println("" );
			        	System.out.println("Veuillez saisir quel animal vous voulez soigner : (tapez l'index) ");
			        	choiceCaseThree = scCaseThree.nextInt();
			        	animalToHealth = enclosureToWatch.researchAnimal(choiceCaseThree);
			        	controller.getZoo().getWorker().takeCare(animalToHealth);
			        	
			        case 5:
			        	controller.getZoo().displayEnclosures();
			        	
						Scanner scCaseFive = new Scanner(System.in);
			        	System.out.println("Veuillez saisir quel enclos vous voulez regarder : (tapez l'index) ");
			        	int choiceCaseFive = scCaseFive.nextInt();
			        	enclosureToWatch = controller.getZoo().researchEnclosure(choiceCaseFive);
			        	System.out.println("" );
			        	enclosureToWatch.displayAnimals();
			        	System.out.println("" );
			        	System.out.println("Veuillez saisir quel animal vous voulez transferer : (tapez l'index) ");
			        	choiceCaseFive = scCaseFive.nextInt();
			        	
			        	System.out.println("Veuillez saisir vers quel enclos vous voulez le transferer : (tapez l'index) ");
			        	int choiceCaseFiveBis = scCaseFive.nextInt();
			        	Enclosure enclosureToWatchTo = controller.getZoo().researchEnclosure(choiceCaseFiveBis);
			        	controller.getZoo().getWorker().transferAnimal(choiceCaseFive, enclosureToWatch,enclosureToWatchTo);
			        	
			        	
			        	
			        	break;
			        default:
			            System.out.println("Choix incorrect");
			            break;
			    }
					
					System.out.println("Vous avez saisi le nombre : " + choice);
					jeton--;
					
				}
				System.out.println("Vous pourrez recuperer vos actions dans 15 secondes");
				Thread.sleep(15000);
				
			}
			
			
		}
		
		
				
		
		
		
		
		
		
		
		
		

		
		System.out.println(controller.getZoo().getListEnclosures().getFirst().getClass().getSimpleName());
		
	}
	
	
	
}
