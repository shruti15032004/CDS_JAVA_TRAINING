import java.sql.SQLOutput;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("CURRENCY CONVERTER");
        System.out.println("1. INR to DOLLAR ");
        System.out.println("2. DOLLAR to INR ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose the currency");//taking user input
        int  choice = scanner.nextInt();
        System.out.println("Enter your amount");
        double amount= scanner.nextDouble();

        switch (choice){
            case 1 :
                inr_to_dollar(amount);
                break;
            case 2:
                dollar_to_inr(amount);
                break;
            default:
                System. out.println("Invalid choice");
        }

    }

    private static void dollar_to_inr(double amount) {
        System.out.println(amount+" Dollar = " + (amount*83.75) + " Rupees");
        System.out.println();

    }

    private static void inr_to_dollar(double amount) {
        System.out.println(amount+" Rupees = " + (amount*0.012) + " Dollar");
        System.out.println();


    }

}
