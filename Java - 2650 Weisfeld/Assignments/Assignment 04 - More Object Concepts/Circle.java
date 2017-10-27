// Class Circle
import java.awt.*;
 
public class Circle extends Shape {
	
		public Circle (double r) {
			
			area = 3.14 * r * r;
			
		}
    
        public void getArea () {
    	
    		System.out.println("Circle's area = " + area);
    	
    	};
}