import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
         printMyName();


    }


    private static void printMyName() {
       Scanner scanner =new Scanner(System.in);
        String myNAme=scanner.nextLine();
        System.out.println(myNAme);
    }


}
