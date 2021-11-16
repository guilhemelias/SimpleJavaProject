package enclosure;

public class Enclosure {
	
	private String name;
	private float superficiy;
	private int capacity;
	private int currentAnimals;
	private Cleanliness cleanliness;
	
	

	public Enclosure(String name, float superficy, int capacity) {
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


	public int getCurrentAnimals() {
		return currentAnimals;
	}


	public void setCurrentAnimals(int currentAnimals) {
		this.currentAnimals = currentAnimals;
	}


	public Cleanliness getCleanliness() {
		return cleanliness;
	}


	public void setCleanliness(Cleanliness cleanliness) {
		this.cleanliness = cleanliness;
	}
}
