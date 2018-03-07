public class CarInsurancePolicy										// No Default Constructor
{
	private int policyNumber;
	private int numPayments;
	private String residentCity;
	
	public CarInsurancePolicy(int policyNumber, int numPayments, String residentCity)
	{
		this.policyNumber = policyNumber;
		this.numPayments = numPayments;
		this.residentCity = residentCity; 
	}
	
	public CarInsurancePolicy(int policyNumber, int numPayments)
	{
		this.policyNumber = policyNumber;
		this.numPayments = numPayments;
		this.residentCity = "Mayfield";
	}
	
	public CarInsurancePolicy(int policyNumber)
	{
		this.policyNumber = policyNumber;
		this.numPayments = 2;
		this.residentCity = "Mayfield";
	}
	
	public void display()
	{
		System.out.println("Policy #" + policyNumber + " requires " + numPayments + 
			" payments anually. Driver resides in " + residentCity + ".");
	}
	

}