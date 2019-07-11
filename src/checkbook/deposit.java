package checkbook;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class deposit {
   
    public static double Total;
    public static int count;
    accountSummary obj2 = new accountSummary();
    
    Checkbook obj = new Checkbook();
    Scanner input = new Scanner(System.in);
    public void deposit(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Enter amount to deposit");
        System.out.print("USD ");
        double amnt = input.nextDouble();
        if(amnt <= 0){
            System.out.println("Invalid Entry");
            System.out.print("USD ");
            amnt = input.nextDouble();
        }else{
            Total += amnt;
//            Clear screen function
            System.out.println("Deposit Complete! "+dtf.format(now));
            String theTime = dtf.format(now);

            accountSummary.account[count] = "Transaction [Deposit] \t USD "+ Double.toString(amnt)+" Time: "+theTime;
            System.out.println("CURRENT BALANCE: "+Checkbook.round(Total, 2));
            count++;
            obj.mainActivity();
        }
    }
}
