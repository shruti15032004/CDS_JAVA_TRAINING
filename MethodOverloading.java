import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Enter the todAY  EARNING and expense");
        Scanner scanner= new Scanner(System.in);
        int earning=scanner.nextInt();
        int expense= scanner.nextInt();
         int saving = todaySavings(earning,expense);
        System.out.println("Saving is : "+saving);
        double earningUPI = scanner.nextDouble();
        double expenseUPI= scanner.nextDouble();
        double savingUPI=todaySavings(earningUPI,expenseUPI);

    }

    private static double todaySavings(double earningUPI, double expenseUPI) {
        return (earningUPI-expenseUPI);
    }

    private static int todaySavings(int earning, int expense) {
        return(earning -expense);
    }
}
