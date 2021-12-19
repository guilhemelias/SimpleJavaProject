package zoo;
import enclosure.*;

import employee.*;

import simulation.*;
import java.util.LinkedList;




public class Zoo {
	
	
	private String name;
	private int enclosureCapacity;
	private int currentCapacity=0;
	private Worker worker;
	private LinkedList<Enclosure> listEnclosures = new LinkedList<Enclosure>();
	
	
	private Clock clock; 
	private EnclosureClock enclosureClock;
	
	
	
	public Zoo(String name,int enclosureCapacity,String workerName,int ageWorker , Gender genderWorker) {
		this.name=name;
		this.enclosureCapacity=enclosureCapacity;
		worker = new Worker(workerName,ageWorker,genderWorker);
		this.clock=new Clock("starve","tired","sickness","baby","makeSound");
		this.enclosureClock = new EnclosureClock("cleanliness");
	}
	
	
	
	
	public void startSimulation() {
		this.enclosureClock.run();
		this.clock.run();
	}
	
	public void stopSimulation() {
		this.enclosureClock.stop();
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
			System.out.println(i + " : "+this.listEnclosures.get(i).getClass().getSimpleName() + " - Name : " + this.listEnclosures.get(i).getName() + " - Capacity : " + this.listEnclosures.get(i).getCapacity() +" - Clean : "+ this.listEnclosures.get(i).getCleanliness());
	    }
	}
	
	
	public void displayEnclosuresAndAnimals() {
		int size=this.listEnclosures.size();
		for (int i = 0; i < size; i++)
	    {
			System.out.println(this.listEnclosures.get(i).getClass().getSimpleName() + " - Name : " + this.listEnclosures.get(i).getName() + " - Capacity : " + this.listEnclosures.get(i).getCapacity() +" - Clean : "+ this.listEnclosures.get(i).getCleanliness());
			this.listEnclosures.get(i).displayAnimals();
			System.out.println("");
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

	




	public EnclosureClock getEnclosureClock() {
		return enclosureClock;
	}




	public void setEnclosureClock(EnclosureClock enclosureClock) {
		this.enclosureClock = enclosureClock;
	}
	
	 
}
