package HelpfulStuff;

public class HelpfulAutoMethods {
	
    public static void delay(int time) {
    	try {
    		Thread.sleep(time);
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    }
    
}
