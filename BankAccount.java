public abstract class BankAccount
{
   private double balance;
   private int num_Deposits;
   private int num_Withdraws;
   private double annual_Interest_rate;
   public double monthly_Service_Charge;
   // constructor with two arguments.
   public BankAccount(double balance, double annual_Interest_rate)
   {
      this.balance= balance;
      this.annual_Interest_rate= annual_Interest_rate;
      this.num_Deposits=0;
      this.num_Withdraws=0;
      this.monthly_Service_Charge=0;
   }
   public void deposit(double amount_deposit)
   {
      balance= (balance+ amount_deposit);
      num_Deposits++;
   }
   public void withdraw(double amount_withdrawal)
   {
      balance= (balance-amount_withdrawal);
      num_Withdraws++;
   }
   public void calcInterest()
   {
      double monthly_interest_rate=(annual_Interest_rate/12);
      double monthly_interest= (this.balance*monthly_interest_rate);
      balance= (balance+monthly_interest);
    }
    public void monthlyProcess()
    {
      balance= balance-monthly_Service_Charge;
      calcInterest();
      num_Withdraws=0;
      num_Deposits=0;
      monthly_Service_Charge=0;
      
    }
    
    // getter and setter methods
    public double getBalance()
    {
      return balance;
    }
    public void setBalance()
    {
      this.balance= balance;
    }
    public int getNum_Deposits()
    {
      return num_Deposits;
    }
    public void setNum_Deposits()
    {
      this.num_Deposits= num_Deposits;
    }
    public int getNum_Withdraws()
    {
      return num_Withdraws;
    }
    public void setNum_Withdraws()
    {
      this.num_Withdraws= num_Withdraws;
    }
    public double getAnnual_Interest_Rate()
    {
      return annual_Interest_rate;
    }
    public void setAnnual_Interest_Rate()
    {
      this.annual_Interest_rate= annual_Interest_rate;
    }
    public double getMonthly_Service_Charge()
    {
      return monthly_Service_Charge;
    }
    public void setMonthly_Service_Charge()
    {
      this.monthly_Service_Charge= monthly_Service_Charge;
    }
   
}