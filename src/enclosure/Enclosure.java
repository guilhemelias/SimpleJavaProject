package enclosure;

public class Enclosure {
	
	private String name;
	private float superficiy;
	private int capacity;
	private int currentAnimals;
	

	public Enclosure(String name, float superficy, int capacity) {
		
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


	public int getCurrentAnimals() {
		return currentAnimals;
	}


	public void setCurrentAnimals(int currentAnimals) {
		this.currentAnimals = currentAnimals;
	}
}
