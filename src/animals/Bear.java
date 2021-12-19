package animals;

/**
 * @author Guilhem
 *
 */
public class Bear extends Viviparous{

	/**
	 * bear constructor
	 * @param name
	 * @param size
	 * @param weight
	 * @param age
	 * @param gender
	 */
	public Bear(String name, int size, int weight, int age, boolean gender) {
		super(name, size, weight, age, gender);
		// TODO Auto-generated constructor stub
	}

	/**
	 *Specific cry method for the bear
	 */
	@Override
	public void cry() {
		System.out.println("IM A BEAR");
	}

	/**
	 *give birth
	 */
	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return null;
	}
}
