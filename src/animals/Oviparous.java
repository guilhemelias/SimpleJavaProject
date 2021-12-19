package animals;

import java.lang.reflect.Constructor;

/**
 * @author Guilhem
 *abstract class to Animal who gave birth by eggs
 */
public abstract class Oviparous extends Animal{

	/**
	 * constructor
	 * @param name
	 * @param size
	 * @param weight
	 * @param age
	 * @param gender
	 */
	public Oviparous(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	/**
	 *make sound method
	 */
	@Override
	public void cry() {
		System.out.println("IM AN OVIPAROUS");
	}
}
