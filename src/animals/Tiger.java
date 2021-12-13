package animals;

import animals.iComportment.IWanderer;

public class Tiger extends Viviparous  implements IWanderer{

	public Tiger(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void cry() {
		System.out.println("IM A TIGER");
	}

	@Override
	public String wandering() {
		// TODO Auto-generated method stub
		return "Cours Forest";
	}

	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
