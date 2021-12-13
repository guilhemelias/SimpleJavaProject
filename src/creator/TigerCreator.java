package creator;

import animals.Tiger;

public class TigerCreator extends ViviparousCreator{
	@Override
	public Tiger createAnimal(String name, int size , int weight, int age, boolean gender) {
		// TODO Auto-generated method stub
		return new Tiger(name,size,weight,age,gender);
	}
}
