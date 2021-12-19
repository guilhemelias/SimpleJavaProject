package simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;





/**
 * @author Guilhem
 *Clock class for animal events
 */
public class Clock extends TimerTask {
	
	
	Map<String, List<EventListener>> listeners = new HashMap<>();
	
	

    Timer timer = new Timer();
    
    
    
    
    /**
     * @param operations
     * first constructor which take operations list for the eventlistener
     */
    public Clock(String... operations) {
        for (String operation : operations) {
        	System.out.println(operation);
            this.listeners.put(operation, new ArrayList<>());
        }
    }
    
    /**
     * @param listener
     * second constructor for sheduled tasks
     */
    public Clock(Map<String, List<EventListener>> listener) {
    	this.listeners = listener;
    }
    
    

    /**run simulation  method
     *
     */
    @Override
    public void run() {
        int delay = (2 + new Random().nextInt(10)) * 1000;
        timer.schedule(new Clock(this.listeners), delay);
        
        
        //CODE A METTRE
        int random = new Random().nextInt(30);
        
        if(random<4) {
        	this.notify("sickness");
        }

        if(random <3) {
        	this.notify("makeSound");
        }else if(random>5 && random <17) {
        	this.notify("starve");
        	
        }else {
        	this.notify("tired");
        }
        
    }
    
    
    /**
     * stop simulation method
     */
    public void stop() {
    	this.cancel();
    	this.timer.cancel();
    }
    
    
    

    

    /**
     * subscribe listeners to events
     * @param eventType
     * @param listener
     */
    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    /**
     * unsubscribe listeners to events
     * @param eventType
     * @param listener
     */
    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }
    
    /**
     * notify listeners from an event that they are subscribes
     * @param eventType
     */
    public void notify(String eventType) {
        //this.listeners.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

        List<EventListener> users = listeners.get(eventType);
        
        for (EventListener listener : users) {        	
			listener.update(eventType);
        }
    }



}