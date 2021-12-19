package controller;

import java.util.Random;

import animals.Animal;
import employee.Gender;
import enclosure.Enclosure;
import enclosure.EnumCleanliness;
import simulation.EventListener;
import zoo.Zoo;

/**
 * @author Guilhem
 *class to communicate between model and view
 */
public class Controller implements EventListener{
	private Zoo zoo;

	
	/**
	 * create the zoo for the game
	 * @param name
	 * @param enclosureCapacity
	 * @param workerName
	 * @param ageWorker
	 * @param genderWorker
	 */
	public void createZoo(String name,int enclosureCapacity,String workerName,int ageWorker,Gender genderWorker) {
		this.zoo= new Zoo(name,enclosureCapacity,workerName,ageWorker,genderWorker);
	}
	
	
	
	/**
	 * @return
	 */
	public Zoo getZoo() {
		return zoo;
	}
	/**
	 * @param zoo
	 */
	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}
	
	
	
	/**
	 * choose a random enclosure from the list of enclosures
	 * @return enclosure
	 */
	public Enclosure chooseRandomEnclosure() {
		
		int size = this.zoo.getListEnclosures().size();
		int randomIndex =new Random().nextInt(size);
		return this.zoo.getListEnclosures().get(randomIndex);
		
	}
	
	/**
	 * choose a random animal from the list of animals
	 * @return animal
	 */
	public Animal chooseRandomAnimal() {
		Enclosure enclosureChoosen =  this.chooseRandomEnclosure();
		int size = enclosureChoosen.getListAnimals().size();
		int randomIndex =new Random().nextInt(size);
		
		return enclosureChoosen.getListAnimals().get(randomIndex);
	}
	
	
	/**
	 * method used too if in the situation where we have a worker which is also simulated
	 * method to check and clean enclosure
	 * @param enclosure
	 */
	public void checkAndCleanEnclosure(Enclosure enclosure) {
		EnumCleanliness clean = this.zoo.getWorker().examinEnclosure(enclosure)	;
		if(clean == EnumCleanliness.CLEAN) {
			System.out.println("Déja clean");
			return;
		}
		else {
			System.out.println("Je nettoie");
			this.zoo.getWorker().washEnclosure(enclosure);
		}
	}
	
	
	
	/**
	 * method for alterate the cleanliness of an enclosure
	 */
	public void changeCleanliness() {

		Enclosure enclosureToChange = this.chooseRandomEnclosure();

		if(enclosureToChange.getCleanliness() == EnumCleanliness.CLEAN) {
			enclosureToChange.setCleanliness(EnumCleanliness.NORMAL);
		}else {
			enclosureToChange.setCleanliness(EnumCleanliness.BAD);
		}
	}
	
	public void feedThemAll(Enclosure enclosure) {
		int size=enclosure.getListAnimals().size();
		for (int i = 0; i < size; i++)
	    {
			this.zoo.getWorker().giveFood(enclosure.getListAnimals().get(i));
	    }
	}
	
	
	
	
	/**
	 * @param enclosure
	 * method not used but can be used for the case if we make the worker in the simulation
	 * it serve to check all animal of an enclosure and ake care of them if its needed
	 */
	public void checkAnimals(Enclosure enclosure) {
		
		enclosure.displayAnimals();
		
		int size=enclosure.getListAnimals().size();
		for (int i = 0; i < size; i++)
	    {
			int nbStarving = 0;
			if(enclosure.getListAnimals().get(i).isSick()) {
				this.zoo.getWorker().takeCare(enclosure.getListAnimals().get(i));				
			}
			if(enclosure.getListAnimals().get(i).isHungry()) {
				nbStarving++;
				if(nbStarving==3) {
					this.feedThemAll(enclosure);
				}
			}
	    }
	}
	
	
	/**
	 * @param animal
	 * make the animal sick in the simulation
	 */
	public void sickness(Animal animal) {
		animal.sick();
	}
	
	/**
	 * @param animal
	 * make the animal cry in the simulation
	 */
	public void makeSound(Animal animal) {
		if(animal.isSleeping()) {
			return;
		}
		animal.cry();
	}
	
	/**
	 * @param animal
	 * make the animal hunger in the simulation
	 */
	public void starve(Animal animal) {
		if(animal.isSleeping()) {
			return;
		}
		animal.starving();
	}
	
	/**
	 * @param animal 
	 * make the animal sleep in the simulation
	 */
	public void tired(Animal animal) {
		if(animal.isSleeping()) {
			return;
		}
		animal.fallAsleep();
	}
	
	
	

	/**
	 * It's here that the controller get notify from the simulator and make actions in function notified
	 */
	@Override
	public void update(String eventType) {
		// TODO Auto-generated method stub
		
		switch(eventType){

        case "cleanliness": 
            this.changeCleanliness();
            break;

        case "checkEnclosure":
        	
        	int random = new Random().nextInt(this.getZoo().getListEnclosures().size());
        	
            Enclosure enclosureToCheck = this.getZoo().researchEnclosure(random);
            this.checkAndCleanEnclosure(enclosureToCheck);
            break;
        case "starve":
        	this.starve(this.chooseRandomAnimal());
        	break;
        case "tired":
        	this.tired(this.chooseRandomAnimal());
        	break;
        case "sickness":
        	this.sickness(this.chooseRandomAnimal());
        	break;
        case "makeSound":
        	this.makeSound(this.chooseRandomAnimal());
        	break;
        case "display":
        	//this.zoo.displayEnclosuresAndAnimals();
        	break;
        case "checkAnimals" : 
        	System.out.println("CheckAnimal");
        	this.checkAnimals(this.chooseRandomEnclosure());
        	break;       	
        default:
            System.out.println("Choix incorrect");
            break;
    }

	}
	
	
}
