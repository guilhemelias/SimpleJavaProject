package animals;

import animals.iComportment.*;


/**
 * @author Guilhem
 *
 */
public class Auk extends Oviparous implements IFlyer,ISwimmer{

	public Auk(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Specific cry method for the auk
	 */
	@Override
	public void cry() {
		System.out.println("IM AN AUK");
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
	 *Flying comportment added with IFlyer interface
	 */
	@Override
	public String flying() {
		// TODO Auto-generated method stub
		return "I BELIEVE I CAN FLY";
	}

	

	/**
	 * give birth
	 */
	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}
}
