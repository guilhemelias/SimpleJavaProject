package animals;

import java.util.Random;



/**
 * @author Guilhem
 * animal class
 *
 */
public abstract class Animal {
	
	protected String name;
	protected float size;
	protected float weight;
	protected int age;
	protected boolean gender;
	protected boolean isSick;
	protected boolean isHungry;
	protected boolean isSleeping;
	
	

//CONSTRUCTOR////////////////////////////////////////////////

	/**
	 * @param name
	 * @param size
	 * @param weight
	 * @param age
	 * @param gender
	 * constructor of class Animal
	 */
	public Animal(String name, int size , int weight, int age, boolean gender) {
		this.name=name;
		this.size=size;
		this.weight=weight;
		this.age=age;
		this.gender=gender;
		isSick=false;
		isHungry=false;
		isSleeping=false;
		
	}
	
//Methods////////////////////////////////////////////////////////////	
	
	/**
	 * @return
	 * give birth
	 */
	public abstract Animal giveBirth();
	public void cry() {
			System.out.println("IM AN ANIMAL");
		}

	/**
	 * give hunger to animal
	 */
	public void starving() {
		this.setHungry(true);
	}
	/**
	 * give food to animal
	 */
	public void eatFood() {
		this.setHungry(false);
	}
	/**
	 * fall asleep the animal
	 */
	public void fallAsleep(){
		this.setSleeping(true);
		
	}
	/**
	 * wake up the animal
	 */
	public void wakeUp(){
		this.setSleeping(false);
	}
	/**
	 * health the animal
	 */
	public void care() {
		this.setSick(false);
	}
	/**
	 * guve sickness to the animal
	 */
	public void sick() {
		this.setSick(true);
	}
	
	
//getter setter////////////////////////////////////////////////////////
	
	/**
	 * @return
	 */
	public float getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(float size) {
		this.size = size;
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
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
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
	public boolean isGender() {
		return gender;
	}

	
	/**
	 * @param gender
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	/**
	 * @return
	 */
	public boolean isSick() {
		return isSick;
	}

	/**
	 * @param isSick
	 */
	public void setSick(boolean isSick) {
		this.isSick = isSick;
	}

	/**
	 * @return
	 */
	public boolean isHungry() {
		return isHungry;
	}

	/**
	 * @param isHungry
	 */
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	/**
	 * @return
	 */
	public boolean isSleeping() {
		return isSleeping;
	}

	/**
	 * @param isSleeping
	 */
	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}
	
	
	/**
	 *to String Animal method
	 */
	public String toString() {
		return this.getClass().getSimpleName() +" - "+ this.name+ " -  is sleeping : " + this.isSleeping + " -  is starving : " + this.isHungry + " - is sick : " + this.isSick;
		
	}
	

}
