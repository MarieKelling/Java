public class SpaService	//USED IN CreateSpaServices.java
{
	
		private String serviceDescription;
		private double price; 
		
		public SpaService()																	//Default Constructor that sets: 
		{																							    //		- serviceDescription to XXX 
			serviceDescription = "XXX";													//		- price to 0; even though 0 is already default--Makes intentions clear
			price = 0;
		}
		
		public void setServiceDescription(String service)					//Sets value for serviceDescription
		{
			serviceDescription = service;
		}
		
		public void setPrice(double pr)												//Sets value for price
		{
			price = pr;
		}

		public String getServiceDescription()										
		{
			return serviceDescription;
		}
		
		public double getPrice() 
		{
			return price;
		}
}