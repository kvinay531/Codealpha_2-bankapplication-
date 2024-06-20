import java.util.Scanner;
public class Bankapplication {
    private static double balance=0;
    private static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("The simple bank applications");
        while(true){
        System.out.println("Enter the option");
        System.out.println("1.Deposit");
        System.out.println("2.Withdeaw");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        int option=sc.nextInt();
            if(option==1){
                deposit();
            }else if(option==2){
                withdraw();
            }else if(option==3){
                checkBalance();
            }
            else if(option==4){
                System.out.println("GoodBye");
                break;

            }
            else{
                System.out.println("Enter a valid option");

            }
        }
        sc.close();
    }
     private static void deposit(){
        System.out.println("Enter the amount you want to deposit");
        double amount=sc.nextDouble();
        balance+=amount;
        System.out.println("Deposit sucessfully");
        System.out.println("you have currently Rs"+balance);

    }
    private static void withdraw(){
        System.out.println("Enter the amount you want to withdraw");
        double amount=sc.nextDouble();
        if(balance>=amount){
            balance-=amount;
            System.out.println("withdraw sucessfully");
            System.out.println("you have currently Rs."+balance);

        }
        else{
             System.out.println("Insufficient balance");

        }
    }
    private static void checkBalance(){
                    System.out.println("Your current Balance:Rs."+balance);
    }
        
    
}
    

