package enclosure;
import animals.*;

import java.util.LinkedList;

/**
 * @author Guilhem
 *
 */
public class Enclosure {
	
	protected String name;
	protected float superficiy;
	protected int capacity;
	protected EnumCleanliness cleanliness;
	protected LinkedList<Animal> listAnimals = new LinkedList<Animal>();
	
	

	/**
	 * constructor
	 * @param name
	 * @param superficy
	 * @param capacity
	 */
	public Enclosure(String name, float superficy, int capacity){
		this.name=name;
		this.superficiy=superficy;
		this.capacity=capacity;
		cleanliness=EnumCleanliness.CLEAN;
		
	}
	
	
	/**
	 * mthod to display all animal from the enclosure
	 */
	public void displayAnimals() {
		int size=this.listAnimals.size();
		for (int i = 0; i < size; i++)
	    {
			System.out.println(i + " - "+this.listAnimals.get(i));
	    }
	}
	
	
	/**
	 * add animal to then enclosure
	 * @param animal
	 * @return
	 */
	public boolean addAnimal(Animal animal) {
		if(this.listAnimals.isEmpty()) {
			this.listAnimals.add(animal);
			return true;
		}
		else {
			String currentRace = this.listAnimals.getFirst().getClass().getSimpleName();
			String animalRace = animal.getClass().getSimpleName();
			if(currentRace.compareTo(animalRace)!=0) {
				System.out.println("Cet enclos ne contient que des "+currentRace+", impossible de mettres des "+animalRace+" dedans.");
				return false;
			}
			this.listAnimals.add(animal);
			return true;
			
		}
	}
	
	/**
	 * retire animal from enclosure
	 * @param index
	 * @return
	 */
	public Animal retireAnimal(int index) {
		Animal animal = this.researchAnimal(index);
		this.listAnimals.remove(index);
		return animal;
	}
	
	/**
	 * research a specific animal with an index
	 * @param index
	 * @return
	 */
	public Animal researchAnimal(int index) {
		Animal animal = null;
		int size=this.listAnimals.size();
		for (int i = 0; i < size; i++)
	    {
	        animal= this.listAnimals.get(i);
	    }
		return animal;
		
	}


	/**
	 * @return
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return
	 */
	public float getSuperficiy() {
		return superficiy;
	}


	/**
	 * @param superficiy
	 */
	public void setSuperficiy(float superficiy) {
		this.superficiy = superficiy;
	}


	/**
	 * @return
	 */
	public int getCapacity() {
		return capacity;
	}


	/**
	 * @param capacity
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	/**
	 * @return
	 */
	public EnumCleanliness getCleanliness() {
		return cleanliness;
	}


	/**
	 * @param cleanliness
	 */
	public void setCleanliness(EnumCleanliness cleanliness) {
		this.cleanliness = cleanliness;
	}


	/**
	 * @return
	 */
	public LinkedList<Animal> getListAnimals() {
		return listAnimals;
	}


	/**
	 * @param listAnimals
	 */
	public void setListAnimals(LinkedList<Animal> listAnimals) {
		this.listAnimals = listAnimals;
	}
	
	
	/**
	 *to string method
	 */
	public String toString() {
		return "Je suis un enclos prénomé"+this.name+", j'ai une capacité de "+this.capacity+" j'ai une superficie de "+
				this.superficiy+" et j'ai une propreté de "+this.cleanliness+" je contient uniquement des "+ this.listAnimals.getFirst().getClass().getSimpleName();
		
	}
}
