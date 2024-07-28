import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String name="Shruti Sharma";
        System.out.println(name.toUpperCase());// this process is called as string Formatting
        System.out.println(name.toLowerCase());
        System.out.println("Enter your name: ");
        Scanner scanner=new Scanner(System.in);
        String sname= scanner.nextLine();
        if (sname.equals("Shruti Sharma"))
        {
            System.out.println("allowed");

        }
        else{
            System.out.println("not allowed");
            //reverse the given string
            // find repeated character in string||count-4,name-a
        }

    }
}
