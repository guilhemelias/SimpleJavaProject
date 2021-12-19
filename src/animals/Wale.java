package animals;

import animals.iComportment.ISwimmer;

/**
 * @author Guilhem
 *
 */
public class Wale extends Viviparous implements ISwimmer{

	/**
	 * constructor
	 * @param name
	 * @param size
	 * @param weight
	 * @param age
	 * @param gender
	 */
	public Wale(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * make sound method
	 */
	@Override
	public void cry() {
		System.out.println("IM A WALE");
	}
	
	/**
	 * swimming comportment added with ISwimmer interface
	 */
	@Override
	public String swimming() {
		// TODO Auto-generated method stub
		return "FLORENT MANAUDOU";
	}

	/**
	 * give brith method
	 */
	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}

}
