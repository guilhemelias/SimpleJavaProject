package animals;

public class Bear extends Viviparous{

	public Bear(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cry() {
		System.out.println("IM A BEAR");
	}

	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}
}
