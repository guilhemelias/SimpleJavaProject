package controller;

import java.util.Random;

import animals.Animal;
import employee.Gender;
import enclosure.Enclosure;
import enclosure.EnumCleanliness;
import simulation.EventListener;
import zoo.Zoo;

public class Controller implements EventListener{
	private Zoo zoo;
	private Enclosure enclosureSelect;
	protected Animal animalSelect;
	
	public void createZoo(String name,int enclosureCapacity,String workerName,int ageWorker,Gender genderWorker) {
		this.zoo= new Zoo(name,enclosureCapacity,workerName,ageWorker,genderWorker);
	}
	
	public Enclosure getEnclosureSelect() {
		return enclosureSelect;
	}
	public void setEnclosureSelect(Enclosure enclosureSelect) {
		this.enclosureSelect = enclosureSelect;
	}
	public Animal getAnimalSelect() {
		return animalSelect;
	}
	public void setAnimalSelect(Animal animalSelect) {
		this.animalSelect = animalSelect;
	}
	public Zoo getZoo() {
		return zoo;
	}
	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}
	
	
	
	public Enclosure chooseRandomEnclosure() {
		
		int size = this.zoo.getListEnclosures().size();
		int randomIndex =new Random().nextInt(size);
		return this.zoo.getListEnclosures().get(randomIndex);
		
	}
	
	public Animal chooseRandomAnimal() {
		Enclosure enclosureChoosen =  this.chooseRandomEnclosure();
		int size = enclosureChoosen.getListAnimals().size();
		int randomIndex =new Random().nextInt(size);
		
		return enclosureChoosen.getListAnimals().get(randomIndex);
	}
	
	
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
	
	
	public void sickness(Animal animal) {
		animal.sick();
	}
	
	public void makeSound(Animal animal) {
		if(animal.isSleeping()) {
			return;
		}
		animal.cry();
	}
	
	public void starve(Animal animal) {
		if(animal.isSleeping()) {
			return;
		}
		animal.starving();
	}
	
	public void tired(Animal animal) {
		if(animal.isSleeping()) {
			return;
		}
		animal.fallAsleep();
	}
	
	
	

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
