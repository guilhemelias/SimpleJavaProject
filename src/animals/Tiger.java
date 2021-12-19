package animals;

import animals.iComportment.IWanderer;

/**
 * @author Guilhem
 *
 */
public class Tiger extends Viviparous  implements IWanderer{

	/**
	 * constructor
	 * @param name
	 * @param size
	 * @param weight
	 * @param age
	 * @param gender
	 */
	public Tiger(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *make sound method
	 */
	@Override
	public void cry() {
		System.out.println("IM A TIGER");
	}

	/**
	 * wandering comportment added with IWanderer interface
	 */
	@Override
	public String wandering() {
		// TODO Auto-generated method stub
		return "Cours Forest";
	}

	/**
	 * give birth method
	 */
	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
