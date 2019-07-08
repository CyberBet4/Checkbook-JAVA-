package checkbook;

import java.util.Scanner;

public class withdrawal {
    deposit obj = new deposit();
    Scanner input = new Scanner(System.in);
    
    public void withdraw(){
        Checkbook objcheck = new Checkbook();
        
//        This block checks if your balance is less or equal zero
        if(obj.Total <= 0){
            System.out.println("Sorry! You cannot make any withdraws at the moment");
            System.out.println("CURRENT BALANCE: USD "+obj.Total);
            objcheck.mainActivity();
        }else{
        System.out.println("Enter amount to withdraw");
        System.out.print("USD ");
        double amnt = input.nextDouble();
        
//        this block checks if your total amount is less or greater than your
//            withdraw amount
        if(obj.Total >= amnt){
            obj.Total -= amnt;
            System.out.println("Withdraw Complete! "+java.time.LocalDateTime.now());
            System.out.println("Your New Balance is: USD "+obj.Total);
            objcheck.mainActivity();
        }else{
            System.out.println("Insufficient Funds!");
            objcheck.mainActivity();
        }
    }
    }
}
