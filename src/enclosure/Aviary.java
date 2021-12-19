package enclosure;

/**
 * @author Guilhem
 *
 */
public class Aviary extends Enclosure {
	
	private float height;

	/**
	 * constructor
	 * @param name
	 * @param superficy
	 * @param capacity
	 * @param height
	 */
	public Aviary(String name, float superficy, int capacity, float height) {
		super(name, superficy, capacity);
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 */
	public float getHeight() {
		return height;
		
	}

	/**
	 * @param height
	 */
	public void setHeight(float height) {
		this.height = height;
	}

}
