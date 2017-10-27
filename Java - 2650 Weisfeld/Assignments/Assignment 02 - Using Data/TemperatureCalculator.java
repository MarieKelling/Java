import java.util.*;
 
class Temperature {
	

	public double FahrenheitToCelsius(double fahrenheit) {
		
		double temperature = 0;
		
		// Fahrenheit To Celsius conversion code

		temperature = (fahrenheit - 32 ) / 1.8;
		
		return temperature;
		
	}
	
		public double CelsiusToFahrenheit(double celsius) {
		
		double temperature = 0;
		
		// put Celsius To Fahrenheit conversion code here
		
		temperature = celsius * 1.8 + 32;
		
		return temperature;
		
	}
	
}
 
class TemperatureCalculator {
	
  public static void main(String[] args) {
  	
  	Temperature temp = new Temperature();
  	
    System.out.println("Fahrenheit conversion = " + temp.FahrenheitToCelsius(32));
    
    System.out.println("Celsius conversion = " + temp.CelsiusToFahrenheit(100));
	
	 System.out.println("Press any key to continue..");
    
  }
}
