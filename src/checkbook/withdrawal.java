package checkbook;

import static checkbook.deposit.count;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class withdrawal {
    deposit obj = new deposit();
    accountSummary obj2 = new accountSummary();
    Scanner input = new Scanner(System.in);
    
    public void withdraw(){
        Checkbook objcheck = new Checkbook();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
//        This block checks if your balance is less or equal zero
        if(obj.Total <= 0){
            System.out.println("Sorry! You cannot make any withdraws at the moment");
            System.out.println("CURRENT BALANCE: USD "+obj.Total);
            objcheck.mainActivity();
        }else{
        System.out.println("Enter amount to withdraw");
        System.out.print("USD ");
        double amnt = input.nextDouble();
        
//        this block checks if your current balance is less or greater than your
//            withdraw amount and prompts error if the withdraw is more than
//            the current balance.
        if(obj.Total >= amnt){
            obj.Total -= amnt;
//            Clear screen function
            System.out.println("Withdraw Complete! "+java.time.LocalDateTime.now());
            String theTime = dtf.format(now);
            accountSummary.account[count] = "Transaction [Withdrawal] USD "+ Double.toString(amnt)+" Time: "+theTime;
            System.out.println("Your New Balance is: USD "+obj.Total);
            count++;
            objcheck.mainActivity();
        }else{
            System.out.println("Insufficient Funds!");
            objcheck.mainActivity();
        }
    }
    }
}
