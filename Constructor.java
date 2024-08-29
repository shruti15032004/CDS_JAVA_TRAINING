import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String fname=scanner.nextLine();
        String lname = scanner.nextLine();

    }
}
class A{
    public A() {
      this.fname=fname;
      this.lname=lname;
        System.out.println(fname+lname);
    }
    String fname;

String lname;
}
