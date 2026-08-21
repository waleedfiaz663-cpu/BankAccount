import java.util.Scanner;
public class AccountClassTest {
    
    public static void main(String[]args)
    {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter account number");
        int userAcc = myObj.nextInt();   
        
        System.out.println("Enter balance ");
        double userbalance= myObj.nextDouble();  
        
        System.out.println("User Account= is: " + userAcc); 
        System.out.println("User balce= is: " + userbalance); 
        
        AccountClass a1=new AccountClass(userAcc,userbalance);
        
        
        System.out.println("---------User Account= is: " + a1.getaccountnumber()); 
        System.out.println("----------User balce= is: " + a1.getbalance());
        a1.setAccountnumber(150);
        a1.setBalance(500000);
        
        System.out.println("---------User Account= is: " + a1.getaccountnumber()); 
        System.out.println("----------User balce= is: " + a1.getbalance());
        
  
    }
}
