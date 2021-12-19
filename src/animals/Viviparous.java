package animals;

/**
 * @author Guilhem
 *
 */
public abstract class Viviparous extends Animal {

	/**
	 * constructor
	 * @param name
	 * @param size
	 * @param weight
	 * @param age
	 * @param gender
	 */
	public Viviparous(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * make sound method
	 */
	@Override
	public void cry() {
		System.out.println("IM A VIVIPAROUS");
	}

}
