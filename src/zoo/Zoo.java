package zoo;
import enclosure.*;
import employee.*;

import simulation.*;
import java.util.LinkedList;

import animals.Animal;
import controller.AnimalController;
import controller.EnclosureController;


public class Zoo {
	
	
	private String name;
	private int enclosureCapacity;
	private int currentCapacity=0;
	private Worker worker;
	private LinkedList<Enclosure> listEnclosures = new LinkedList<Enclosure>();
	
	
	private Clock clock; 
	private WorkerClock workerClock;
	private EnclosureClock enclosureClock;
	
	
	
	public Zoo(String name,int enclosureCapacity,String workerName,int ageWorker , Gender genderWorker) {
		this.name=name;
		this.enclosureCapacity=enclosureCapacity;
		worker = new Worker(workerName,ageWorker,genderWorker);
		this.clock=new Clock("starve","tired","sickness","baby","makeSound");
		this.workerClock = new WorkerClock("checkEnclosure","transferAnimal","checkAnimals");
		this.enclosureClock = new EnclosureClock("cleanliness");
	}
	
	
	
	
	public void startSimulation() {
		this.enclosureClock.run();
		this.workerClock.run();
		this.clock.run();
	}
	
	public void stopSimulation() {
		this.enclosureClock.stop();
		this.workerClock.stop();
		this.clock.stop();
	}
	
	
	
	
	
	
	
	
	
	public String toString() {
		return "Zoo de "+this.name+", j'ai une capacité de "+this.enclosureCapacity+" et j'ai un employé "+
				this.getWorker().getGender()+this.getWorker().getName()+" agé de "+this.getWorker().getAge();
		
	}
	
	
	public void addEnclosure(Enclosure enclosure) {
		if(currentCapacity==enclosureCapacity) {
			System.out.println("zoo plein");
			return;
		}
		listEnclosures.add(enclosure);
		currentCapacity++;
	}
	
	public void deleteEnclosure() {
		
	}
	
	
	public Enclosure researchEnclosure(int index) {
		
		return this.listEnclosures.get(index);
		
	}
	
	
	public void displayEnclosures() {
		int size=this.listEnclosures.size();
		for (int i = 0; i < size; i++)
	    {
			System.out.println(this.listEnclosures.get(i).getClass().getSimpleName() + " - Name : " + this.listEnclosures.get(i).getName() +" - Clean : "+ this.listEnclosures.get(i).getCleanliness());
	    }
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnclosureCapacity() {
		return enclosureCapacity;
	}
	public void setEnclosureCapacity(int enclosureCapacity) {
		this.enclosureCapacity = enclosureCapacity;
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}	
	
	public Clock getClock() {
		return clock;
	}
	public void setClock(Clock clock) {
		this.clock = clock;
	}
	public LinkedList<Enclosure> getListEnclosures() {
		return listEnclosures;
	}
	public void setListEnclosures(LinkedList<Enclosure> listEnclosures) {
		this.listEnclosures = listEnclosures;
	}

	public WorkerClock getWorkerClock() {
		return workerClock;
	}

	public void setWorkerClock(WorkerClock workerClock) {
		this.workerClock = workerClock;
	}




	public EnclosureClock getEnclosureClock() {
		return enclosureClock;
	}




	public void setEnclosureClock(EnclosureClock enclosureClock) {
		this.enclosureClock = enclosureClock;
	}
	
	 
}
