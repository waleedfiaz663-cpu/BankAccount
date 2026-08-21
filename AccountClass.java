
public class AccountClass {
    
    private int accountnumber;
    private double balance;

    
    public AccountClass(int accountnumber,double balance){
        setaccountnumber(accountnumber);
        setbalance(balance);
        System.out.println("User Account= is: " + getaccountnumber()); 
        System.out.println("User balce= is: " + getbalance()); 
        
    }
        public AccountClass(){
        
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    public void setaccountnumber(int accountnumber){
        this.accountnumber=accountnumber;
    }
    public void setAccountnumber(int accountnumber)
    {
        if(accountnumber>0)
        {
            this.setaccountnumber(accountnumber);
        }
        else
        {
            System.out.println("invalid account number");
        }
    }
        public int getaccountnumber()
        {
            return accountnumber;
        } 
        
        public void setBalance(double balance){
            if(balance>0)
            {
                this.balance=balance;
            }
            else
            {
                System.out.println("invalid balance");
                
            }
             }
            public double getbalance()
            {
                return balance;
            }
        
public void deposit(double amount)
{
 if(amount>0)
{
balance+=amount;
System.out.println("deposited:"+ amount);

}
 else
 {
     System.out.println("invalid amount deposited");
 }
}
public void withdraw(double amount)
{
    if(amount>0&&amount<=balance)
    {
        balance-=amount;
        System.out.println("withdraw:"+amount);
       
    }
    else
    {
        System.out.println("invalid amount withdraw");
    }
}
}



 

    
    

    

    

