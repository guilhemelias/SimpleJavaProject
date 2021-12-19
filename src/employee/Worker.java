
package employee;

import animals.Animal;
import enclosure.Enclosure;
import enclosure.EnumCleanliness;

/**
 * @author Guilhem
 *
 */
public class Worker{
	
	private String name;
	private int age;
	private Gender gender;
	
	/**
	 * constructor
	 * @param name
	 * @param age
	 * @param gender
	 */
	public Worker(String name, int age ,Gender gender ) {
		this.name=name;
		this.age=age;
		this.setGender(gender);
	}
	
	
	/**
	 * give food to an animal
	 * @param animal
	 */
	public void giveFood(Animal animal) {
		animal.eatFood();
	}
	
	/**
	 * take care of an animal
	 * @param animal
	 */
	public void takeCare(Animal animal) {
		animal.care();
	}
	
	/**
	 * wake up an animal
	 * @param animal
	 */
	public void wakeUp(Animal animal) {
		animal.wakeUp();
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	/**
	 * method for exmanin the cleanliness of an enclosure
	 * @param enclosure
	 * @return
	 */
	public EnumCleanliness examinEnclosure(Enclosure enclosure) {
		return enclosure.getCleanliness();
	}
	
	/**
	 * method for wash an enclosure and make it clean
	 * @param enclosure
	 */
	public void washEnclosure(Enclosure enclosure) {
		enclosure.setCleanliness(EnumCleanliness.CLEAN);
	}
	
	/**
	 * method to transfer animal from an enclosure to another
	 * @param animal
	 * @param enclosure
	 * @param enclosureTo
	 */
	public void transferAnimal(int animal,Enclosure enclosure, Enclosure enclosureTo) {
		Animal animalToTransfer = enclosure.retireAnimal(animal);
		if(!enclosureTo.addAnimal(animalToTransfer)) {
			enclosure.addAnimal(animalToTransfer);
		}
		
	}
	

}
