package simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;





public class Clock extends TimerTask {
	
	
	Map<String, List<EventListener>> listeners = new HashMap<>();
	
	

    Timer timer = new Timer();
    
    
    
    
    public Clock(String... operations) {
        for (String operation : operations) {
        	System.out.println(operation);
            this.listeners.put(operation, new ArrayList<>());
        }
    }
    
    public Clock(Map<String, List<EventListener>> listener) {
    	this.listeners = listener;
    }
    
    

    @Override
    public void run() {
        int delay = (2 + new Random().nextInt(10)) * 1000;
        timer.schedule(new Clock(this.listeners), delay);
        
        
        //CODE A METTRE
        int random = new Random().nextInt(30);
        
        if(random<3) {
        	this.notify("sickness");
        }

        if(random <6) {
        	this.notify("makeSound");
        }else if(random>5 && random <17) {
        	this.notify("starve");
        	
        }else {
        	this.notify("tired");
        }
        
    }
    
    
    public void stop() {
    	this.cancel();
    	this.timer.cancel();
    }
    
    
    

    

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }
    
    public void notify(String eventType) {
        //this.listeners.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

        List<EventListener> users = listeners.get(eventType);
        
        for (EventListener listener : users) {        	
			listener.update(eventType);
        }
    }



}