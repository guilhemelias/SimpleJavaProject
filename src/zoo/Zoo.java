package zoo;
import enclosure.*;
import employee.*;

import java.util.LinkedList;

public class Zoo {
	
	private String name;
	private int enclosureCapacity;
	private Worker worker;
	private LinkedList<Enclosure> listEnclosures = new LinkedList<Enclosure>();
	
	
	public Zoo(String name,int enclosureCapacity,String workerName,int ageWorker , Gender genderWorker) {
		this.name=name;
		this.enclosureCapacity=enclosureCapacity;
		worker = new Worker(workerName,ageWorker,genderWorker);
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
