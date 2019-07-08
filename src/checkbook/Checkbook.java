package checkbook;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  
import java.util.Scanner;

public class Checkbook {
    public void mainActivity(){
        
        deposit obj = new deposit();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("##################################################");
        System.out.println("#                                                #");
        System.out.println("#               CHECK BOOK PROGRAM               #");
        System.out.println("#                                                #");
        System.out.println("##################################################");
        System.out.println("                       CURRENT BALANCE: USD "+obj.Total);
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
            case "WITHDRAW":  withdraw.withdraw();
            break;
            case "DEPOSIT": obj.deposit();
            break;
            case "QUIT":    System.exit(0);
            break;
            default:  System.out.println("Invalid Input!");
            mainActivity();
            break;
        }
    }
    public static void main(String[] args) {
        /*   Check Book Program   */    
        Checkbook obj = new Checkbook();
        obj.mainActivity();
    }
    
}
