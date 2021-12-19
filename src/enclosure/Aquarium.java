package enclosure;

/**
 * @author Guilhem
 *
 */
public class Aquarium extends Enclosure {
	
	
	private float depth;
	public float salinity;

	/**
	 * constructor
	 * @param name
	 * @param superficy
	 * @param capacity
	 * @param depth
	 * @param salinity
	 */
	public Aquarium(String name, float superficy, int capacity, float depth, float salinity) {
		super(name, superficy, capacity);
		this.depth=depth; 
		this.salinity=salinity;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 */
	public float getDepth() {
		return depth;
	}

	/**
	 * @param depth
	 */
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	/**
	 * @return
	 */
	public float getSalinity() {
		return salinity;
	}

	/**
	 * @param salinity
	 */
	public void setSalinity(float salinity) {
		this.salinity = salinity;
	}

}
