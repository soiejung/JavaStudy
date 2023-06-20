package ch04_control.self;

public class ControlTest05 {
    public static void main(String[] args) {
        // TODO: 1+(-2)+3+(-4)+... 과 같은 식으로 더해나갈 때, 총합이 100이상이 되려면 몇까지 더해야 하는가?
    	
    	int total = 0;
    	int i = 1;
    	while (total < 100) {
    		
    		if (i % 2 == 0) {
    			total -= i;
    		}
    		else {
    			total += i;
    		}
    		i += 1;
    	}
    	
    	System.out.printf("%d", i);
    		
        // END
    }
}
