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
        int delay = (2 + new Random().nextInt(5)) * 1000;
        timer.schedule(new Clock(this.listeners), delay);
        
        
        //CODE A METTRE

        if(new Random().nextInt(10) < 5) {
        	this.notify("cleanliness");
        }
        else {
        	this.notify("starve");        
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