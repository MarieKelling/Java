public class CarInsurancePolicy2									//Constructors more efficient 
{
	private int policyNumber;
	private int numPayments;
	private String residentCity;
	
	public CarInsurancePolicy2(int policyNumber, int numPayments, String residentCity)
	{
		this.policyNumber = policyNumber;
		this.numPayments = numPayments;
		this.residentCity = residentCity; 
	}
	
	public CarInsurancePolicy2(int policyNumber, int numPayments)
	{
		this(policyNumber, numPayments, "Mayfield");
	}
	
	public CarInsurancePolicy(int policyNumber)
	{
		this(policyNumber, 2, "Mayfield");						//Could further simplify by removing "Mayfield". the 1-param version 
	}																				//	calls the 2-param version, which calls the 3-param version and sets the city.

}