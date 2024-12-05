public class SavingsAccount extends BankAccount
{
   private boolean status;
   // declare the constructor
   public SavingsAccount(double balance, double annual_Interest_rate)
   {
      // intialize the super class constructor
      super(balance, annual_Interest_rate);
      if(balance>= 25)
      {
         status= true;
      }
      else 
      {
         status= false;
      }
   }
   public void withdraw(double amount)
   {
      if(status)
      {
         super.withdraw(amount);
         if(super.getBalance()<25)
         {
            status= false;
         }
        
   }
   
   public void deposit(double amount_deposit)
   {
      if(!status)
      {
         double available=super.getBalance()+amount_deposit;
      }
      if(available>=25)
      {
         status= true;
      }
      super.deposit(amount_deposit);
   }   
   public void monthlyProcess()
   {
      int count_NumWithdraws= super.getNum_Withdraws();
      if(count_NumWithdraws>4)
      {
         super.monthly_Service_Charge= (count_NumWithdraws-4);
         super.setMonthly_Service_Charge();
         super.monthlyProcess();
         if(super.getBalance()<25)
         {
            status= false;
         }
      }
   }
   // gtter and setter for status
   public boolean isStatus()
   {
      return status;
   }
   public void setStatus(boolean status)
   {
      this.status= status;
   }
}