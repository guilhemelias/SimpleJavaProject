package zoo;
import enclosure.*;
import employee.*;

import simulation.*;
import java.util.LinkedList;

import controller.AnimalController;
import controller.EnclosureController;


public class Zoo {
	
	private EnclosureController enclosureController = new EnclosureController();
	private AnimalController animalController = new AnimalController();
	private String name;
	private int enclosureCapacity;
	private int currentCapacity=0;
	private Worker worker;
	private LinkedList<Enclosure> listEnclosures = new LinkedList<Enclosure>();
	
	
	private Clock clock = new Clock(enclosureController,animalController);
	
	public Zoo(String name,int enclosureCapacity,String workerName,int ageWorker , Gender genderWorker) {
		this.name=name;
		this.enclosureCapacity=enclosureCapacity;
		worker = new Worker(workerName,ageWorker,genderWorker);
		
	}
	
	public void startSimulation() {
		this.clock.run();
	}
	
	public void stopSimulation() {
		this.clock.stop();
	}
	
	
	
	
	public String toString() {
		return "Je suis un zoo prénomé"+this.name+", j'ai une capacité de "+this.enclosureCapacity+" j'ai un employé "+
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
	public LinkedList<Enclosure> getListEnclosures() {
		return listEnclosures;
	}
	public void setListEnclosures(LinkedList<Enclosure> listEnclosures) {
		this.listEnclosures = listEnclosures;
	}
	
	 
}
