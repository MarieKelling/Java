//Class Triangle

public class Triangle extends Shape
{
	
	public Triangle (double b, double h) 
	{
    		
    		area = .5 * (b * h);
    		
    }
    
    public void getArea () 
	{
   
    	System.out.println("Triangle's area = " + area);
			
	}
		
}