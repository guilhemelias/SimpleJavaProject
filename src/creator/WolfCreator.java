package creator;

import animals.*;

public class WolfCreator extends ViviparousCreator{

	@Override
	public Wolf createAnimal(String name, int size , int weight, int age, boolean gender) {
		// TODO Auto-generated method stub
		return new Wolf(name,size,weight,age,gender);
	}

}
