package checkbook;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class deposit {
/** public final static void clearConsole()
{
    try
    {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
    catch (final Exception e)
    {
        //  Handle any exceptions.
    }
} */
    
    public static double Total;
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
            System.out.println("Deposit Complete! "+java.time.LocalDateTime.now());
            String theTime = dtf.format(now);
            accountSummary.account[0] = "Deposit Transaction \t\t"+ Double.toString(Total);
            System.out.println("CURRENT BALANCE: "+Total);
            
//            clearConsole();
            obj.mainActivity();
        }
    }
}
