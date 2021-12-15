package enclosure;
import animals.*;

import java.util.LinkedList;

public class Enclosure {
	
	protected String name;
	protected float superficiy;
	protected int capacity;
	protected EnumCleanliness cleanliness;
	protected EnumRace race;
	protected LinkedList<Animal> listAnimals = new LinkedList<Animal>();
	
	

	public Enclosure(String name, float superficy, int capacity){
		this.name=name;
		this.superficiy=superficy;
		this.capacity=capacity;
		cleanliness=EnumCleanliness.CLEAN;
		
	}
	
	
	public void addAnimal(Animal animal) {
		if(!this.listAnimals.isEmpty()) {
			this.listAnimals.add(animal);
		}
		else {
			String currentRace = this.listAnimals.getFirst().getClass().getSimpleName();
			String animalRace = animal.getClass().getSimpleName();
			if(currentRace.compareTo(animalRace)!=0) {
				System.out.println("Cet enclos ne contient que des "+currentRace+", impossible de mettres des "+animalRace+" dedans.");
				return;
			}
			this.listAnimals.add(animal);
			
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSuperficiy() {
		return superficiy;
	}


	public void setSuperficiy(float superficiy) {
		this.superficiy = superficiy;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public EnumCleanliness getCleanliness() {
		return cleanliness;
	}


	public void setCleanliness(EnumCleanliness cleanliness) {
		this.cleanliness = cleanliness;
	}


	public LinkedList<Animal> getListAnimals() {
		return listAnimals;
	}


	public void setListAnimals(LinkedList<Animal> listAnimals) {
		this.listAnimals = listAnimals;
	}
}
