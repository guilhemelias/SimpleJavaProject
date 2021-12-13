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
	
	

	public Enclosure(String name, float superficy, int capacity, EnumRace race){
		this.name=name;
		this.superficiy=superficy;
		this.capacity=capacity;
		cleanliness=EnumCleanliness.CLEAN;
		this.race = race;
		
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
