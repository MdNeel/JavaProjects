 import java.util.ArrayList;
 import java.util.Scanner;
 public class ShipArray
 {
   public static void main(String[]args)
   {
      //ring testName;
      //ring testBuilt;
     //nt testMpgr;
     //ouble testCapacity;
  // Ship a = new Ship();
  // CruiseShip b = new CruiseShip()
  // CargoShip ship = new CargoShip()
     Scanner keyboard = new Scanner(System.in);
    
     String n= null;
     String y = null;
     int m=0;
     int c = 0;
     System.out.println("Please enter the name of ship /enter stop to terminate");
     n = keyboard.next();
    
     ArrayList<String>nameList = new ArrayList<String>();
     ArrayList<String>builtList = new ArrayList<String>();
     ArrayList<Integer>maximumPassengersList = new ArrayList< Integer>();
     ArrayList<Integer>capacityList = new ArrayList<Integer >();
     nameList.add("Neel");
     builtList.add("1970");
     maximumPassengersList.add(2000);
     
     capacityList.add(20);
    Ship a = new Ship(n,y);
    CruiseShip b = new CruiseShip(n,y,m);
    CargoShip ship = new CargoShip(c,n,y);
     
     while (!n.equalsIgnoreCase("Stop")) 
     {
        System.out.println("Please enter the year of ship :");
        y = keyboard.next();
        System.out.println("Please enter the number of maximum pass");
        m = keyboard.nextInt();
        System.out.println("Please enter the capacity of the cargo :");
        c = keyboard.nextInt();
       // Ship a = new Ship(n,y);
     //CruiseShip b = new CruiseShip(n,y,m);
     //CargoShip ship = new CargoShip(c,n,y);

        nameList.add(n);
        builtList.add(y);
        maximumPassengersList.add(m);
        capacityList.add(c);
        
        System.out.println("Please enter the name of ship /enter stop to terminate");
        n = keyboard.next();
    
       System.out.println();
    
       
      }
      
      for(int i = 0; i< nameList.size(); i++){
         a.setName(nameList.get(i));
         System.out.println(a.toString());
         a.setBuilt(builtList.get(i));
         ship.setCapacity(capacityList.get(i));
         System.out.println(ship.toString());
         b.setMaximumPassengers(maximumPassengersList.get(i));
         System.out.println(b.toString());
      
      }
      
      
   }
 }