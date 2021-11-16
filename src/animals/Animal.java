package animals;

public abstract class Animal {
	
	protected String name;
	protected float size;
	protected float weight;
	protected int age;
	protected boolean gender;
	protected boolean isSick;
	protected boolean isHungry;
	protected boolean isTired;
	
	

//CONSTRUCTOR////////////////////////////////////////////////

	public Animal(String name, int size , int weight, int age, boolean gender) {
		this.name=name;
		this.size=size;
		this.weight=weight;
		this.age=age;
		this.gender=gender;
		isSick=false;
		isHungry=false;
		isTired=false;
		
	}
	
//Methods////////////////////////////////////////////////////////////	
	public void cry() {
			System.out.println("GRAOU");
		}

	
	public void eatFood() {
		this.setHungry(false);
	}
	
	public void sleep(){
		this.setTired(false);
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

	public boolean isTired() {
		return isTired;
	}

	public void setTired(boolean isTired) {
		this.isTired = isTired;
	}

}
