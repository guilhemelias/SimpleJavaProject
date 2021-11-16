package enclosure;

public class Aquarium extends Enclosure {
	
	
	private float depth;
	public float salinity;

	public Aquarium(String name, float superficy, int capacity, float depth, float salinity) {
		super(name, superficy, capacity);
		this.depth=depth; 
		this.salinity=salinity;
		// TODO Auto-generated constructor stub
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	public float getSalinity() {
		return salinity;
	}

	public void setSalinity(float salinity) {
		this.salinity = salinity;
	}

}
