package checkbook;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  
import java.util.Scanner;

public class Checkbook {
    public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
    }
    
    public void mainActivity(){
        accountSummary obj2 = new accountSummary();
        deposit obj = new deposit();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("##################################################");
        System.out.println("#                                                #");
        System.out.println("#               CHECK BOOK PROGRAM               #");
        System.out.println("#                                                #");
        System.out.println("##################################################");
        System.out.println("                       CURRENT BALANCE: USD "+round(deposit.Total, 2));
        System.out.println("                    DATE/TIME: "+dtf.format(now));
        System.out.println("1.   Enter 'withdraw' to make a withdraw");
        System.out.println("2.   Enter 'deposit' to make a deposit");
        System.out.println("3.   Enter 'account' to view your Account Summary");
        System.out.println("4.   Enter 'quit' to close the application");
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        System.out.print("input: ");
        String option = (input.nextLine());
        option = option.toUpperCase();
        withdrawal withdraw = new withdrawal();
        switch(option){
        /* Switch option for the commands used in the program */    
            case "WITHDRAW":  withdraw.withdraw();
            break;
            case "DEPOSIT": obj.deposit();
            break;
            case "ACCOUNT": obj2.summary();
            break;
            case "QUIT":    System.exit(0);
            break;
            default:  System.out.println("Invalid Input!");
            mainActivity();
            break;
        }
    }
    public static void main(String[] args) {
        /**   Check Book Program   
         * this block calls the main Activity function ...
        */    
        Checkbook obj = new Checkbook();
        obj.mainActivity();
    }
    
}
