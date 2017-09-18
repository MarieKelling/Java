public class DemoOverload
{

	public static void main(String[] args)
	{
		int month = 6, day = 24, year = 2017;
		displayDate(month);
		displayDate(month, day);
		displayDate(month, day, year);
		
		
	}
	
		public static void displayDate(int m)
		{
			System.out.println("Event date " + m + "/1/2016");
		}
		
		public static void displayDate(int m, int d)
		{
			System.out.println("Event date " + m + "/" + d + "/2016");
		}
		
		public static void displayDate(int m, int d, int yy)
		{
			System.out.println("Event date " + m + "/" + d + "/" + yy);
		} 

}