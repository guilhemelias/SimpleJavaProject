package animals;

import animals.iComportment.ISwimmer;

public class Shark extends Viviparous implements ISwimmer{

	public Shark(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void cry() {
		System.out.println("IM A SHARK");
	}
	
	@Override
	public String swimming() {
		// TODO Auto-generated method stub
		return "FLORENT MANAUDOU";
	}

	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}

}
