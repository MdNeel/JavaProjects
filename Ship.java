 public class Ship
 {
  //Declare the fields 
  private String name;
  private String built;
 // Create a constructor 
 public Ship(String n, String b)
   {
	   name = n;
	   built = b;
   }
//	Create an accessor methods to set the name and built year.
 public void setName(String n)
   {
	   name = n;
   }
 public void setBuilt(String b)
   {
	   built = b;
   } 
 //Create the mutator methods to get the name and year of the ship.
 public String getName()
   {
	   return name;
   }
 public String getBuilt()
   {
	 return built;
   }

 //Create a toString method to display the ship’s name and year of built
 public String toString()
   {
	   String str = "Name of the ship : " + getName() +"\n Year of built is : " + getBuilt();
	   return str;
   }
  }
 
