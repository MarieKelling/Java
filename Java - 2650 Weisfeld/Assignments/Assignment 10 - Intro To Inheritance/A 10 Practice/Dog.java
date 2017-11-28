public class Dog extends Mammal implements Nameable 
{
	
   String name;
   Head head;
   
   public void makeNoise()
   {
	   System.out.println("Bark");
   }
   
   public void setName (String aName) 
   {
	   name = aName;
   }
   
   public String getName () 
   {
	   return (name);
   }
   
}