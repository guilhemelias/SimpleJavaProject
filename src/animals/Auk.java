package animals;

import animals.iComportment.*;


public class Auk extends Oviparous implements IFlyer,ISwimmer{

	public Auk(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void cry() {
		System.out.println("IM AN AUK");
	}

	@Override
	public String swimming() {
		// TODO Auto-generated method stub
		return "FLORENT MANAUDOU";
	}

	@Override
	public String flying() {
		// TODO Auto-generated method stub
		return "I BELIEVE I CAN FLY";
	}

	

	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}
}
