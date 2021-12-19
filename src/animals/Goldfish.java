package animals;

import animals.iComportment.ISwimmer;

public class Goldfish extends Oviparous implements ISwimmer{

	public Goldfish(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *Specific cry method for the goldfish
	 */
	@Override
	public void cry() {
		System.out.println("IM A GOLDFISH");
	}

	/**
	 *swimming comportment added with ISwimmer interface
	 */
	@Override
	public String swimming() {
		// TODO Auto-generated method stub
		return "FLORENT MANAUDOU";
	}

	/**
	 *give birth
	 */
	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}

}
