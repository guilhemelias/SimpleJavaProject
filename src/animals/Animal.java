package animals;

import animals.iComportment.IGiveBirth;

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
	
	public abstract Animal giveBirth();
	public void cry() {
			System.out.println("IM AN ANIMAL");
		}

	public void starving() {
		this.setHungry(true);
	}
	
	public void eatFood() {
		this.setHungry(false);
	}
	
	public void fallAsleep(){
		this.setSleeping(true);
	}
	
	public void wakeUp(){
		this.setSleeping(false);
	}
	
	public void care() {
		this.setSick(false);
	}
	
	public void sick() {
		this.setSick(true);
	}
	
	
//getter setter////////////////////////////////////////////////////////
	
	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}


	public boolean isGender() {
		return gender;
	}

	
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public boolean isSick() {
		return isSick;
	}

	public void setSick(boolean isSick) {
		this.isSick = isSick;
	}

	public boolean isHungry() {
		return isHungry;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	public boolean isSleeping() {
		return isSleeping;
	}

	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}

}
