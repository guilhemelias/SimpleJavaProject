package animals;

import animals.iComportment.IFlyer;

public class Eagle extends Oviparous implements IFlyer{

	public Eagle(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void cry() {
		
		System.out.println("IM AN EAGLE");
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
