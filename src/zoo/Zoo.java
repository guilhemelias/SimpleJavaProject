package zoo;
import enclosure.*;

import employee.*;

import simulation.*;
import java.util.LinkedList;




/**
 * @author Guilhem
 *clas zoo
 */
public class Zoo {
	
	
	private String name;
	private int enclosureCapacity;
	private int currentCapacity=0;
	private Worker worker;
	private LinkedList<Enclosure> listEnclosures = new LinkedList<Enclosure>();
	
	
	private Clock clock; 
	private EnclosureClock enclosureClock;
	
	
	
	/**
	 * constructor
	 * @param name
	 * @param enclosureCapacity
	 * @param workerName
	 * @param ageWorker
	 * @param genderWorker
	 */
	public Zoo(String name,int enclosureCapacity,String workerName,int ageWorker , Gender genderWorker) {
		this.name=name;
		this.enclosureCapacity=enclosureCapacity;
		worker = new Worker(workerName,ageWorker,genderWorker);
		this.clock=new Clock("starve","tired","sickness","baby","makeSound");
		this.enclosureClock = new EnclosureClock("cleanliness");
	}
	
	
	
	
	/**
	 * method to start the simulation
	 */
	public void startSimulation() {
		this.enclosureClock.run();
		this.clock.run();
	}
	
	/**
	 * method to stop the simulation
	 */
	public void stopSimulation() {
		this.enclosureClock.stop();
		this.clock.stop();
	}
	
	
	
	
	
	
	
	
	
	/**
	 *to string method
	 */
	public String toString() {
		return "Zoo de "+this.name+", j'ai une capacité de "+this.enclosureCapacity+" et j'ai un employé "+
				this.getWorker().getGender()+this.getWorker().getName()+" agé de "+this.getWorker().getAge();
		
	}
	
	
	/**
	 * method to add an enclosure to the zoo
	 * @param enclosure
	 */
	public void addEnclosure(Enclosure enclosure) {
		if(currentCapacity==enclosureCapacity) {
			System.out.println("zoo plein");
			return;
		}
		listEnclosures.add(enclosure);
		currentCapacity++;
	}
	
	
	
	
	/**
	 * method to research an enclosure with index given
	 * @param index
	 * @return
	 */
	public Enclosure researchEnclosure(int index) {
		
		return this.listEnclosures.get(index);
		
	}
	
	/**
	 * method to display all enclosure
	 */
	public void displayEnclosures() {
		int size=this.listEnclosures.size();
		for (int i = 0; i < size; i++)
	    {
			System.out.println(i + " : "+this.listEnclosures.get(i).getClass().getSimpleName() + " - Name : " + this.listEnclosures.get(i).getName() + " - Capacity : " + this.listEnclosures.get(i).getCapacity() +" - Clean : "+ this.listEnclosures.get(i).getCleanliness());
	    }
	}
	
	
	/**
	 * method to dispaly all enclosures with thir animals
	 */
	public void displayEnclosuresAndAnimals() {
		int size=this.listEnclosures.size();
		for (int i = 0; i < size; i++)
	    {
			System.out.println(this.listEnclosures.get(i).getClass().getSimpleName() + " - Name : " + this.listEnclosures.get(i).getName() + " - Capacity : " + this.listEnclosures.get(i).getCapacity() +" - Clean : "+ this.listEnclosures.get(i).getCleanliness());
			this.listEnclosures.get(i).displayAnimals();
			System.out.println("");
	    }
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
	public int getEnclosureCapacity() {
		return enclosureCapacity;
	}
	/**
	 * @param enclosureCapacity
	 */
	public void setEnclosureCapacity(int enclosureCapacity) {
		this.enclosureCapacity = enclosureCapacity;
	}
	/**
	 * @return
	 */
	public Worker getWorker() {
		return worker;
	}
	/**
	 * @param worker
	 */
	public void setWorker(Worker worker) {
		this.worker = worker;
	}	
	
	/**
	 * @return
	 */
	public Clock getClock() {
		return clock;
	}
	/**
	 * @param clock
	 */
	public void setClock(Clock clock) {
		this.clock = clock;
	}
	/**
	 * @return
	 */
	public LinkedList<Enclosure> getListEnclosures() {
		return listEnclosures;
	}
	/**
	 * @param listEnclosures
	 */
	public void setListEnclosures(LinkedList<Enclosure> listEnclosures) {
		this.listEnclosures = listEnclosures;
	}

	




	/**
	 * @return
	 */
	public EnclosureClock getEnclosureClock() {
		return enclosureClock;
	}




	/**
	 * @param enclosureClock
	 */
	public void setEnclosureClock(EnclosureClock enclosureClock) {
		this.enclosureClock = enclosureClock;
	}
	
	 
}
