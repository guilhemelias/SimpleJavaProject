package enclosure;

public class Aviary extends Enclosure {
	
	private float height;

	public Aviary(String name, float superficy, int capacity, float height) {
		super(name, superficy, capacity);
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	public float getHeight() {
		return height;
		
	}

	public void setHeight(float height) {
		this.height = height;
	}

}
