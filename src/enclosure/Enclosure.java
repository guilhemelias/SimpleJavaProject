package enclosure;
import animals.*;

import java.util.LinkedList;

public class Enclosure {
	
	protected String name;
	protected float superficiy;
	protected int capacity;
	protected Cleanliness cleanliness;
	protected LinkedList<Animal> listAnimals = new LinkedList<Animal>();
	
	

	public Enclosure(String name, float superficy, int capacity) {
		this.name=name;
		this.superficiy=superficy;
		this.capacity=capacity;
		cleanliness=Cleanliness.CLEAN;
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


	public Cleanliness getCleanliness() {
		return cleanliness;
	}


	public void setCleanliness(Cleanliness cleanliness) {
		this.cleanliness = cleanliness;
	}


	public LinkedList<Animal> getListAnimals() {
		return listAnimals;
	}


	public void setListAnimals(LinkedList<Animal> listAnimals) {
		this.listAnimals = listAnimals;
	}
}
