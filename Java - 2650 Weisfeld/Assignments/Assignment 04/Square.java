// Class Square
import java.awt.*;
 
public class Square extends Shape {
    
    	public Square (double s) {
    		
    		area = s * s;
    		
    	}
    
        public void getArea () {
    	
    		System.out.println("Square's area = " + area);
    		    	
    	};
}