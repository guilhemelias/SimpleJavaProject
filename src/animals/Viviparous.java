package animals;

public abstract class Viviparous extends Animal {

	public Viviparous(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void cry() {
		System.out.println("IM A VIVIPAROUS");
	}

}
