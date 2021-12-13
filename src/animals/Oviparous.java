package animals;

import java.lang.reflect.Constructor;

public abstract class Oviparous extends Animal{

	public Oviparous(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	@Override
	public void cry() {
		System.out.println("IM AN OVIPAROUS");
	}
}
