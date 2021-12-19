
package employee;

import animals.Animal;
import enclosure.Enclosure;
import enclosure.EnumCleanliness;

public class Worker{
	
	private String name;
	private int age;
	private Gender gender;
	
	public Worker(String name, int age ,Gender gender ) {
		this.name=name;
		this.age=age;
		this.setGender(gender);
	}
	
	
	public void giveFood(Animal animal) {
		animal.eatFood();
	}
	
	public void takeCare(Animal animal) {
		animal.care();
	}
	
	public void wakeUp(Animal animal) {
		animal.wakeUp();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public EnumCleanliness examinEnclosure(Enclosure enclosure) {
		return enclosure.getCleanliness();
	}
	
	public void washEnclosure(Enclosure enclosure) {
		enclosure.setCleanliness(EnumCleanliness.CLEAN);
	}
	
	public void transferAnimal(int animal,Enclosure enclosure, Enclosure enclosureTo) {
		Animal animalToTransfer = enclosure.retireAnimal(animal);
		if(!enclosureTo.addAnimal(animalToTransfer)) {
			enclosure.addAnimal(animalToTransfer);
		}
		
	}
	

}
