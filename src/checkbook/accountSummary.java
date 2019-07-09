package checkbook;

import java.util.Scanner;

public class accountSummary {
    public static String[] account = new String[5];
    
    public void account(int x){
//        function to print the account transactions made..
        if(account[0] == null){
            System.out.println("You have not made any transasctions yet!");
        }else{
        for(int i=0; i< x;i++){
            System.out.println(account[i]);      
        }            
        }

    }
    public void summary(){
        System.out.println("##################################################");
        System.out.println("##################################################");
        System.out.println("#                                                #");
        System.out.println("#               CHECK BOOK PROGRAM               #");
        System.out.println("#                                                #");
        System.out.println("##################################################");
        System.out.println("################# Account Summary ################");
        System.out.println("\n");

        account(deposit.count);
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to continue..");
        String opt = input.nextLine();
//      Clear Screen function here  
        Checkbook obj = new Checkbook();
        obj.mainActivity();
    }
}
