public class Abstract {
    
    public static void main(String[] args) {
    	
		System.out.println("Hello World");
		
		Circle circle = new Circle(3);
		Square square = new Square(2);
		Triangle triangle = new Triangle(4,5);
		
		circle.getArea();
		square.getArea();
		triangle.getArea();
		
    }
}