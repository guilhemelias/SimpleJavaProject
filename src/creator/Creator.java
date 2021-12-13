package creator;

import animals.Animal;

public abstract class Creator {
	
	public abstract Animal createAnimal(String name, int size , int weight, int age, boolean gender);

}
