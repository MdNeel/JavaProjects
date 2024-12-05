public class BankSavingsAccountDemo
{
   public static void main(String args[])
   {
      SavingsAccount sa = new SavingsAccount(80,1.5);
      System.out.println("Initial Account balance is:" + "$"+ sa.getBalance());
      printStatus(sa.isStatus());
      System.out.println("\nWithdraw an amount of " + "$20");
      sa.withdraw(20.00);
      System.out.println("Balance after withdraw :" + sa.getBalance());
      printStatus(sa.isStatus());
      
      System.out.println("\nDeposit an amount of " + "$3");
      sa.deposit(3.00);
      System.out.println("Balance after deposit :" + sa.getBalance());
      printStatus(sa.isStatus());

      
     System.out.println("\nWithdraw an amount of " + "$5");
     sa.withdraw(5.00);
     System.out.println("Balance after withdraw :" + sa.getBalance());
     printStatus(sa.isStatus());
     
     System.out.println("\nDeposit an amount of " + "$3");
     sa.deposit(3.00);
     System.out.println("Balance after deposit :" + sa.getBalance());
     printStatus(sa.isStatus());

     System.out.println("\nWithdraw an amount of " + "$3");
     sa.withdraw(3.00);
     System.out.println("Balance after withdraw :" + sa.getBalance());
     printStatus(sa.isStatus());
     
     System.out.println("\nDeposit an amount of " + "$3");
     sa.deposit(3.00);
     System.out.println("Balance after deposit :" + sa.getBalance());
     printStatus(sa.isStatus());

     System.out.println("\nWithdraw an amount of " + "$10");
     sa.withdraw(10.00);
     System.out.println("Balance after withdraw :" + sa.getBalance());
     printStatus(sa.isStatus());



   
      System.out.println("\nDeposit an amount of " + "$3");
      sa.deposit(3.00);
      System.out.println("Balance after deposit :" + sa.getBalance());
      printStatus(sa.isStatus());
   
      System.out.println("\nWithdraw an amount of " + "$10");
      sa.withdraw(10.00);
      System.out.println("Balance after withdraw :" + sa.getBalance());
      printStatus(sa.isStatus());
   
      System.out.println("\nDeposit an amount of " + "$20");
      sa.deposit(20.00);
      System.out.println("Balance after deposit :" + sa.getBalance());
     // System.out.println("Balance in the end of month"+ "Month:");
      sa.monthlyProcess();
      System.out.println("Balance in the end of month"+ "Month:");
      System.out.println("Balance in the Account is :"+ sa.getBalance());
      printStatus(sa.isStatus());
      System.out.println("Number of the deposits made :" + ":"+sa.getNum_Deposits());
      System.out.println("Number of the withdraws made :" + ":"+sa.getNum_Withdraws());
      System.out.println("Monthly charges :"+ sa.getMonthly_Service_Charge());
   }
   public static void printStatus(boolean status)
   {
      if (status)
      {
         System.out.println("Status of the "+"account is : ACTIVE");
      }
      else 
      {
         System.out.println("Status of the "+"account is : INACTIVE");

      }
      
   }

}